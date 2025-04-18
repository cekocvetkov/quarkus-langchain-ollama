package com.tsvetkov;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface OllamaService {

    @SystemMessage("""
        Act like a pirate. Speak with pirate lingo, be bold, and add a sense of adventure in your responses.
        """
    )
    String answer( @UserMessage String question );
}
