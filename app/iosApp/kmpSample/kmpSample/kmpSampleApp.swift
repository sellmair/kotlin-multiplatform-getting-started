//
//  kmpSampleApp.swift
//  kmpSample
//
//  Created by Sebastian Sellmair on 17.07.24.
//

import SwiftUI
import KmpApp

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> some UIViewController {
        SampleAppViewControllerKt.createViewController()
    }
    
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
        
    }
}

@main
struct kmpSampleApp: App {
    var body: some Scene {
        WindowGroup {
            ComposeView()
        }
    }
}
