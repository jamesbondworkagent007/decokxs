package com.okinc.web3.security.core;

import com.okinc.web3.security.bridge.MnemonicKt;
import com.okinc.web3.security.bridge.MnemonicValidateResult;
import com.okinc.web3.security.bridge.Web3SecurityBridge;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.C59449zhJ;
import o.C59454zhO;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class MnemonicManager {
    public static final MnemonicManager INSTANCE = new MnemonicManager();
    private static final InterfaceC56387yDm wordSet$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.web3.security.core.MnemonicManager$$ExternalSyntheticLambda0
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MnemonicManager.wordSet_delegate$lambda$0();
        }
    });
    private static final InterfaceC56387yDm wordMap$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.web3.security.core.MnemonicManager$$ExternalSyntheticLambda1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MnemonicManager.wordMap_delegate$lambda$2();
        }
    });
    public static final int $stable = 8;

    private MnemonicManager() {
    }

    private final Set<String> getWordSet() {
        return (Set) wordSet$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set wordSet_delegate$lambda$0() {
        return CollectionsKt___CollectionsKt.OqFWZa(Web3SecurityBridge.INSTANCE.getWordList$OKWeb3Security_web3_security_lib(MnemonicKt.MnemonicLanguageEnglish));
    }

    private final Map<String, List<String>> getWordMap() {
        return (Map) wordMap$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map wordMap_delegate$lambda$2() {
        Set<String> wordSet = INSTANCE.getWordSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : wordSet) {
            String strValueOf = String.valueOf(C59454zhO.zLjUOn((CharSequence) obj));
            Object arrayList = linkedHashMap.get(strValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return linkedHashMap;
    }

    public final List<String> getWordsStartWith(@NotNull String str) {
        List<String> list;
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList arrayList = new ArrayList(10);
        if (str.length() > 0 && (list = getWordMap().get(String.valueOf(C59454zhO.zLjUOn((CharSequence) str)))) != null) {
            for (String str2 : list) {
                if (C59449zhJ.startsWith$default(str2, str, false, 2, null) && arrayList.size() < 10) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public final boolean isWordLegitimate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getWordSet().contains(str);
    }

    public final MnemonicValidateResult validatePhrase(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Web3SecurityBridge.INSTANCE.validateMnemonic$OKWeb3Security_web3_security_lib(str);
    }
}
