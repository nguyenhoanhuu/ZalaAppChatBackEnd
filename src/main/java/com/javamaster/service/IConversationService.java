package com.javamaster.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.javamaster.entity.Conversation;
import com.javamaster.entity.Member;
import com.javamaster.entity.Message;

@Service
public interface IConversationService {
	Conversation createConversation(Conversation conversation) throws InterruptedException, ExecutionException;

	/**
	 * 
	 * @param conversationId
	 * @param userId
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	Conversation addFriendInConversation(String conversationId, String userId)
			throws InterruptedException, ExecutionException;

	/**
	 * 
	 * @param conversationId
	 * @return 
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	String deleteConversation(String conversationId) throws InterruptedException, ExecutionException;

	/**
	 * @param conversationId
	 * @param memberId
	 * @param userId
	 * @return a conversation in which a member has left
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	Conversation leaveConversation(String conversationId, String memberId, String userId)
			throws InterruptedException, ExecutionException;

	/**
	 * @param userId
	 * @return a list conversation by userId
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	List<Conversation> getConversationsByUserId(String userId) throws InterruptedException, ExecutionException;

	/**
	 * @param conversationId
	 * @return a conversation by Id
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	Conversation getConversationById(String conversationId) throws InterruptedException, ExecutionException;

	/**
	 * @param conversationId
	 * @return a list of messages by conversationId
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	List<Message> getAllMessageInConversation(String conversationId) throws InterruptedException, ExecutionException;

	/**
	 * @param conversationId
	 * @return a list of member by conversationId
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	List<Member> getAllMemberInConversation(String conversationId) throws InterruptedException, ExecutionException;

	/**
	 * @param conversation
	 * @return the conversation changed the parameters
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	Conversation updateConvertation(Conversation conversation) throws InterruptedException, ExecutionException;

	/**
	 * @param conversationIdDelete
	 * @return success will return 0 or fail will return 1
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	int disbandingTheGroup(String conversationIdDelete) throws InterruptedException, ExecutionException;
}
