package com.okinc.web3.security.features.importing.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C59454zhO;
import o.C59467zhb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class WalletImportUtilsKt {
    public static /* synthetic */ boolean isPossibleSeedPhraseText$default(CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return isPossibleSeedPhraseText(charSequence, z);
    }

    public static final Sequence<String> splitIntoSeedPhraseWords(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return C59467zhb.AYXKKw(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(Regexes.INSTANCE.getSEED_PHRASE_WHITESPACE().splitToSequence(StringsKt__StringsKt.hDKMBd(charSequence), 0), AnonymousClass1.INSTANCE), new Function1() { // from class: com.okinc.web3.security.features.importing.utils.WalletImportUtilsKt$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WalletImportUtilsKt.splitIntoSeedPhraseWords$lambda$2((String) obj);
            }
        }), 24);
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.importing.utils.WalletImportUtilsKt$splitIntoSeedPhraseWords$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<String, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1() {
            super(1, StringsKt.class, "isNotBlank", "isNotBlank(Ljava/lang/CharSequence;)Z", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Boolean.valueOf(!StringsKt__StringsKt.fARcdN((CharSequence) str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String splitIntoSeedPhraseWords$lambda$2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String lowerCase = C59454zhO.AkhnZx(str, 10).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final boolean isPossibleSeedPhraseText(@NotNull CharSequence charSequence, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        for (int i = 0; i < charSequence.length(); i++) {
            if (CharsKt__CharJVMKt.EZpvd(charSequence.charAt(i))) {
                List<String> listSplit = Regexes.INSTANCE.getSEED_PHRASE_WHITESPACE().split(StringsKt__StringsKt.hDKMBd(charSequence), 0);
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj : listSplit) {
                    if (true ^ StringsKt__StringsKt.fARcdN((CharSequence) obj)) {
                        arrayList.add(obj);
                    }
                }
                for (String str : arrayList) {
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        char cCharAt = str.charAt(i2);
                        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
                            return false;
                        }
                    }
                    if (z && str.length() > 10) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
