package com.github.twitch4j.kraken.domain;

import lombok.Data;

import java.util.Map;

@Data
public class KrakenEmotesList {

    private Map<String, KrakenEmote> emoticon_sets;
}
