//
// LoginPostRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct LoginPostRequest: Codable, JSONEncodable, Hashable {

    public var credentials: LoginCredentials

    public init(credentials: LoginCredentials) {
        self.credentials = credentials
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case credentials
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(credentials, forKey: .credentials)
    }
}

