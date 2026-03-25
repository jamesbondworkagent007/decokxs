package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35829oFf {
    public static final ActionBar Companion = new ActionBar(null);

    @yCM
    public C35829oFf() {
    }

    /* JADX INFO: renamed from: o.oFf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object OLrzqt(@NotNull C36558odI c36558odI, @NotNull final java.util.List<java.lang.String> list, @NotNull Continuation<? super C36558odI> continuation) {
        final java.lang.String targetId = c36558odI.OLrzqt().getTargetId();
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c36558odI.AEQbTJ());
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            pUU.KWHzl("RemoveUiMessagesFromMessageListModelUseCase", "[" + targetId + "] execute: to remove: " + ((java.lang.String) it.next()));
        }
        C56406yEe.AEQbTJ(listFJNWhG, new Function1() { // from class: o.oFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C35829oFf.copydefault(list, targetId, (C35254nrp) obj));
            }
        });
        return c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(listFJNWhG), (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI.valueOf : false);
    }

    public static final boolean copydefault(java.util.List list, java.lang.String str, C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        java.lang.String clientMessageId = c35254nrp.OLrzqt().getClientMessageId();
        boolean zContains = clientMessageId == null ? false : list.contains(clientMessageId);
        if (zContains) {
            pUU.KWHzl("RemoveUiMessagesFromMessageListModelUseCase", "[" + str + "] execute: removing: " + clientMessageId);
        }
        return zContains;
    }
}
