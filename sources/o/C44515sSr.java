package o;

import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44515sSr {
    public final C44358sMw copydefault;

    @yCM
    public C44515sSr(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.copydefault = c44358sMw;
    }

    public final java.lang.Object EZpvd(long j, @NotNull Continuation<? super java.util.List<PhoneRelationEntity>> continuation) {
        return this.copydefault.getPhoneRelationsNotSyncYet(j, continuation);
    }
}
