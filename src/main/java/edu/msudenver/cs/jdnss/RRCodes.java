package edu.msudenver.cs.jdnss;

enum RRCodes {
    A(1),
    NS(2),
    CNAME(5),
    SOA(6),
    PTR(12),
    HINFO(13),
    MX(15),
    TXT(16),
    AAAA(28),
    A6(38),
    DNAME(39),
    OPT(41),
    DS(43),
    RRSIG(46),
    NSEC(47),
    DNSKEY(48),
    NSEC3(50),
    NSEC3PARAM(51), // from here down, these aren't RRCodes but are needed for parsing
    INCLUDE,
    ORIGIN,
    TTL,
    EOF,
    NOTOK,
    IPV4ADDR,
    IPV6ADDR,
    LCURLY,
    RCURLY,
    LPAREN,
    RPAREN,
    STRING,
    IN,
    DN,
    INT,
    INADDR,
    STAR,
    BASE64,
    DATE;

    private int code;

    int getCode() {
        Assertion.aver(code != 0);
        return code;
    }

    RRCodes() {
    }

    RRCodes(int code) {
        this.code = code;
    }
}