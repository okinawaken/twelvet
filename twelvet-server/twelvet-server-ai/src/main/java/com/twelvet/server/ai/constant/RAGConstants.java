package com.twelvet.server.ai.constant;

/**
 * <p>
 * RAG相关常量
 * <p>
 *
 * @since 2024/12/12
 */
public interface RAGConstants {

	/**
	 * RAG系统提示词
	 */
	String RAG_SYSTEM_PROMPT = """
			Context information is below.
			---------------------
			{question_answer_context}
			---------------------
			Given the context and provided history information and not prior knowledge,
			reply to the user comment. If the answer is not in the context, inform
			the user that you can't answer the question.
			""";

	/**
	 * MCP工具缓存
	 */
	String MCP_LIST_CACHE = "ai:mcp:list";

	/**
	 * 初始化MCP锁
	 */
	String LOCK_INIT_AI_MCP = "lock_init_ai_mcp";

	/**
	 * MCP 版本缓存
	 */
	String AI_MCP_ID_CACHE = "ai_mcp_id::%s";

	/**
	 * VectorStore创建锁
	 */
	String LOCK_INIT_VECTOR_STORE = "lock_init_vector_store";

	/**
	 * VectorStore全局刷新标识ID缓存key
	 */
	String VECTOR_STORE_REFRESH_ID_CACHE = "ai:vector_store:refresh_id";

}
