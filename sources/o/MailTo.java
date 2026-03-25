package o;

import kotlin.jvm.internal.Intrinsics;
import o.LocalSocket;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MailTo implements InterfaceC5053Cx {
    public final LocalSocket.TaskDescription EZpvd;

    public MailTo(@NotNull LocalSocket.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd = taskDescription;
    }

    @Override // o.InterfaceC5053Cx
    public InterfaceC5045Cp EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "aws.auth#sigv4")) {
            return this.EZpvd.EZpvd();
        }
        throw new java.lang.IllegalStateException(("auth scheme " + ((java.lang.Object) C52643wT.AEQbTJ(str)) + " not configured for client").toString());
    }
}
