package com.okinc.okex.lite.hero.util.download;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DownloadException extends Exception {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.okex.lite.hero.util.download.DownloadException.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DownloadException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static final class InvalidUrlException extends DownloadException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidUrlException(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    private DownloadException(String str) {
        super(str);
    }

    public static final class IOException extends DownloadException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IOException(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }
}
