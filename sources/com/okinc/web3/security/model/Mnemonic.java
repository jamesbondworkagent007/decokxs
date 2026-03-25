package com.okinc.web3.security.model;

import com.okinc.web3.security.utils.WrapApi;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C43246rlf;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Mnemonic {
    public static final int $stable = 8;
    private String language;
    private String phrase;
    private boolean valid;
    private final InterfaceC56387yDm words$delegate;

    public static /* synthetic */ void getWords$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhrase() {
        return this.phrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getValid() {
        return this.valid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.language = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhrase(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.phrase = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValid(boolean z) {
        this.valid = z;
    }

    public Mnemonic(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.phrase = str;
        this.language = str2;
        this.valid = z;
        this.words$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.web3.security.model.Mnemonic$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Mnemonic.words_delegate$lambda$0(this.f$0);
            }
        });
    }

    public final List<String> getWords() {
        return (List) this.words$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List words_delegate$lambda$0(Mnemonic mnemonic) {
        return StringsKt__StringsKt.split$default((CharSequence) WrapApi.dataUnwrap(C43246rlf.OLrzqt.valueOf(), mnemonic.phrase), new String[]{" "}, false, 0, 6, (Object) null);
    }
}
