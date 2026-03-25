package com.okinc.localization2;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C38301pTs;
import o.pUU;
import o.yCM;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class KeysLog {
    private static final String TAG = "KeysLog";
    private final ConcurrentHashMap<String, Integer> missingKeys = new ConcurrentHashMap<>();
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;

    @yCM
    public KeysLog() {
    }

    public final void logIfNecessary(@NotNull String str, CharSequence charSequence) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.missingKeys.containsKey(str)) {
            return;
        }
        if (charSequence == null) {
            str2 = AbstractJsonLexerKt.NULL;
        } else if (charSequence.length() == 0) {
            str2 = "empty";
        } else if (!StringsKt__StringsKt.fARcdN(charSequence)) {
            return;
        } else {
            str2 = "blank";
        }
        this.missingKeys.put(str, 0);
        if (C38301pTs.OLrzqt.AEQbTJ(str)) {
            pUU.KWHzl(TAG, "logIfNecessary, keyName:" + str + " is " + str2);
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.KeysLog.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
