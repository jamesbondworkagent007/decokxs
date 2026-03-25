package com.github.promeg.pinyinhelper;

import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.ahocorasick.trie.Trie;

/* JADX INFO: loaded from: classes21.dex */
public final class Pinyin {
    static List<PinyinDict> mPinyinDicts;
    static SegmentationSelector mSelector;
    static Trie mTrieDict;

    private Pinyin() {
    }

    public static void init(Config config) {
        if (config == null) {
            mPinyinDicts = null;
            mTrieDict = null;
            mSelector = null;
        } else if (config.valid()) {
            mPinyinDicts = Collections.unmodifiableList(config.getPinyinDicts());
            mTrieDict = Utils.dictsToTrie(config.getPinyinDicts());
            mSelector = config.getSelector();
        }
    }

    public static void add(PinyinDict pinyinDict) {
        if (pinyinDict == null || pinyinDict.words() == null || pinyinDict.words().size() == 0) {
            return;
        }
        init(new Config(mPinyinDicts).with(pinyinDict));
    }

    public static Config newConfig() {
        return new Config(null);
    }

    public static String toPinyin(String str, String str2) {
        return Engine.toPinyin(str, mTrieDict, mPinyinDicts, str2, mSelector);
    }

    public static String toPinyin(char c) {
        if (isChinese(c)) {
            return c == 12295 ? "LING" : PinyinData.PINYIN_TABLE[getPinyinCode(c)];
        }
        return String.valueOf(c);
    }

    public static boolean isChinese(char c) {
        return (19968 <= c && c <= 40869 && getPinyinCode(c) > 0) || 12295 == c;
    }

    private static int getPinyinCode(char c) {
        int i = c - 19968;
        if (i >= 0 && i < 7000) {
            return decodeIndex(PinyinCode1.PINYIN_CODE_PADDING, PinyinCode1.PINYIN_CODE, i);
        }
        if (7000 <= i && i < 14000) {
            return decodeIndex(PinyinCode2.PINYIN_CODE_PADDING, PinyinCode2.PINYIN_CODE, c - 26968);
        }
        return decodeIndex(PinyinCode3.PINYIN_CODE_PADDING, PinyinCode3.PINYIN_CODE, c - 33968);
    }

    private static short decodeIndex(byte[] bArr, byte[] bArr2, int i) {
        short s = (short) (bArr2[i] & UnsignedBytes.MAX_VALUE);
        return (bArr[i / 8] & PinyinData.BIT_MASKS[i % 8]) != 0 ? (short) (s | 256) : s;
    }

    public static final class Config {
        List<PinyinDict> mPinyinDicts;
        SegmentationSelector mSelector;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<PinyinDict> getPinyinDicts() {
            return this.mPinyinDicts;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SegmentationSelector getSelector() {
            return this.mSelector;
        }

        private Config(List<PinyinDict> list) {
            if (list != null) {
                this.mPinyinDicts = new ArrayList(list);
            }
            this.mSelector = new ForwardLongestSelector();
        }

        public Config with(PinyinDict pinyinDict) {
            if (pinyinDict != null) {
                List<PinyinDict> list = this.mPinyinDicts;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    this.mPinyinDicts = arrayList;
                    arrayList.add(pinyinDict);
                } else if (!list.contains(pinyinDict)) {
                    this.mPinyinDicts.add(pinyinDict);
                }
            }
            return this;
        }

        public boolean valid() {
            return (getPinyinDicts() == null || getSelector() == null) ? false : true;
        }
    }
}
