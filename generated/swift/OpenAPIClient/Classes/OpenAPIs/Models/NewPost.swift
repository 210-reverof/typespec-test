//
// NewPost.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct NewPost: Codable, JSONEncodable, Hashable {

    public var title: String
    public var content: String

    public init(title: String, content: String) {
        self.title = title
        self.content = content
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case title
        case content
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(title, forKey: .title)
        try container.encode(content, forKey: .content)
    }
}

