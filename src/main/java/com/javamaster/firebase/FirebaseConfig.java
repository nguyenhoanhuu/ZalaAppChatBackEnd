package com.javamaster.firebase;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class FirebaseConfig {
	@PostConstruct
	public void initFirebase() {
		FileInputStream serviceAccount = null;
		try {
			serviceAccount = new FileInputStream("./zala-d8638-firebase-adminsdk-47cca-8466dbda87.json");

			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();

			FirebaseApp.initializeApp(options);

		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

	public Firestore getFirestore() {
		return FirestoreClient.getFirestore();
	}
}
