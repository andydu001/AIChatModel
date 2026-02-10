/*
An AI agent
Writen by AD
 */

package org.example;

import com.alibaba.cloud.ai.graph.CompileConfig;

import com.alibaba.cloud.ai.graph.agent.DefaultBuilder;

import com.alibaba.cloud.ai.graph.agent.ReactAgent;

import com.alibaba.cloud.ai.graph.agent.node.AgentLlmNode;

import com.alibaba.cloud.ai.graph.agent.node.AgentToolNode;

import com.alibaba.cloud.ai.graph.exception.GraphRunnerException;

import org.springframework.ai.chat.client.DefaultChatClient;

import org.springframework.ai.chat.client.advisor.observation.DefaultAdvisorObservationConvention;

import org.springframework.ai.chat.client.observation.DefaultChatClientObservationConvention;

import org.springframework.ai.chat.prompt.ChatOptions;

import org.springframework.ai.deepseek.DeepSeekChatModel;

import org.springframework.ai.deepseek.DeepSeekChatOptions;

import org.springframework.ai.deepseek.api.DeepSeekApi;

import org.springframework.ai.model.SimpleApiKey;

import org.springframework.ai.model.tool.DefaultToolCallingManager;

import org.springframework.ai.template.NoOpTemplateRenderer;

import org.springframework.ai.tool.execution.DefaultToolExecutionExceptionProcessor;

import org.springframework.ai.tool.resolution.DelegatingToolCallbackResolver;

import org.springframework.ai.tool.resolution.ToolCallbackResolver;

import org.springframework.retry.support.RetryTemplate;

import org.springframework.util.LinkedMultiValueMap;

import org.springframework.web.client.DefaultResponseErrorHandler;

import org.springframework.web.client.RestClient;

import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

public class Main {
    public static void main(String[] args) throws GraphRunnerException {

        List<ToolCallbackResolver> toolCallbackResolvers = new ArrayList<>();

        toolCallbackResolvers.add(new ADTOOLS());

        AgentLlmNode agentLlmNode = AgentLlmNode.builder().agentName("Andy").

                chatOptions(ChatOptions.builder().build()).

                chatClient(new DefaultChatClient(new ADDEf(new DeepSeekChatModel(new DeepSeekApi("?", new SimpleApiKey("?"),

                        new LinkedMultiValueMap<>(),"C:\\Users\\andyd\\OneDrive\\Documents\\asd.txt","C:\\Users\\andyd\\OneDrive\\Documents\\asd.txt",

                        RestClient.builder(), WebClient.builder(), new DefaultResponseErrorHandler()),

                        new DeepSeekChatOptions(),new DefaultToolCallingManager(new ADOBS(new ADCURR()), new DelegatingToolCallbackResolver(toolCallbackResolvers),

                        new DefaultToolExecutionExceptionProcessor(true)), new RetryTemplate(), new ADOBS(new ADCURR())), "",

                        new HashMap<>() , new HashMap<>(),"", new HashMap<>(), new HashMap<>(),

                        new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),  new ArrayList<>(), new ArrayList<>(),new DeepSeekChatOptions(),new ArrayList<>(),new HashMap<>(),

                        new ADOBS(new ADCURR()),new DefaultChatClientObservationConvention(),

                        new HashMap<>(),new NoOpTemplateRenderer(),new DefaultAdvisorObservationConvention()

                ))).build();

        ReactAgent agent  = new ReactAgent(agentLlmNode, AgentToolNode.builder().

        toolExecutionExceptionProcessor(new DefaultToolExecutionExceptionProcessor(false)).build(), CompileConfig.builder().build() ,new DefaultBuilder());

        agent.setInstruction("read");

        System.out.println(agent.name());
    }
}