// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

/** Identifies the type of phonetic encoder to use with a PhoneticTokenFilter. */
public enum PhoneticEncoder {
    /** Encodes a token into a Metaphone value. */
    METAPHONE("metaphone"),

    /** Encodes a token into a double metaphone value. */
    DOUBLE_METAPHONE("doubleMetaphone"),

    /** Encodes a token into a Soundex value. */
    SOUNDEX("soundex"),

    /** Encodes a token into a Refined Soundex value. */
    REFINED_SOUNDEX("refinedSoundex"),

    /** Encodes a token into a Caverphone 1.0 value. */
    CAVERPHONE1("caverphone1"),

    /** Encodes a token into a Caverphone 2.0 value. */
    CAVERPHONE2("caverphone2"),

    /** Encodes a token into a Cologne Phonetic value. */
    COLOGNE("cologne"),

    /** Encodes a token into a NYSIIS value. */
    NYSIIS("nysiis"),

    /** Encodes a token using the Kölner Phonetik algorithm. */
    KOELNER_PHONETIK("koelnerPhonetik"),

    /** Encodes a token using the Haase refinement of the Kölner Phonetik algorithm. */
    HAASE_PHONETIK("haasePhonetik"),

    /** Encodes a token into a Beider-Morse value. */
    BEIDER_MORSE("beiderMorse");

    /** The actual serialized value for a PhoneticEncoder instance. */
    private final String value;

    PhoneticEncoder(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PhoneticEncoder instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PhoneticEncoder object, or null if unable to parse.
     */
    public static PhoneticEncoder fromString(String value) {
        if (value == null) {
            return null;
        }
        PhoneticEncoder[] items = PhoneticEncoder.values();
        for (PhoneticEncoder item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.value;
    }
}
