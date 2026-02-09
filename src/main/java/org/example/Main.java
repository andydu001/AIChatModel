package org.example;

import com.alibaba.cloud.ai.graph.agent.AgentTool;

import com.alibaba.cloud.ai.graph.agent.ReactAgent;

import com.alibaba.cloud.ai.graph.agent.node.AgentLlmNode;

import org.springframework.ai.chat.client.DefaultChatClient;

import org.springframework.ai.chat.prompt.ChatOptions;

import org.springframework.ai.deepseek.DeepSeekChatModel;

import org.springframework.ai.deepseek.DeepSeekChatOptions;

import org.springframework.ai.deepseek.api.DeepSeekApi;

import org.springframework.ai.model.tool.DefaultToolCallingManager;

import org.springframework.ai.tool.resolution.DelegatingToolCallbackResolver;

public class Main {
    public static void main(String[] args){

        AgentLlmNode agentLlmNode = AgentLlmNode.builder().agentName("Andy").

                chatOptions(ChatOptions.builder().build()).

                chatClient(new DefaultChatClient(new DefaultChatClient.

                DefaultChatClientRequestSpec(new DeepSeekChatModel(new DeepSeekApi(),

                new DeepSeekChatOptions(),new DefaultToolCallingManager(new ADOBS(new ADCURR()),new DelegatingToolCallbackResolver()))))).build();

        ReactAgent reactAgent = new AgentTool.AgentToolExecutor(new ReactAgent(agentLlmNode ));


    }
}