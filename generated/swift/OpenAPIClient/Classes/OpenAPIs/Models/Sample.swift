//
// Sample.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct Sample: Codable, JSONEncodable, Hashable {

    public var name: String
    public var age: Int64

    public init(name: String, age: Int64) {
        self.name = name
        self.age = age
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case name
        case age
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(name, forKey: .name)
        try container.encode(age, forKey: .age)
    }
}

