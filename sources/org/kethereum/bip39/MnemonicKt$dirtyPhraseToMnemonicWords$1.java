package org.kethereum.bip39;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class MnemonicKt$dirtyPhraseToMnemonicWords$1 extends Lambda implements Function1<String, String> {
    public static final MnemonicKt$dirtyPhraseToMnemonicWords$1 INSTANCE = new MnemonicKt$dirtyPhraseToMnemonicWords$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MnemonicKt$dirtyPhraseToMnemonicWords$1() {
        super(1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.hDKMBd((CharSequence) str).toString();
    }
}
