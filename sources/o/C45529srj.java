package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.srj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45529srj implements InterfaceC43234rlT {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.srj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.srj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("type");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        context.startActivity(ActivityC44878sfI.Companion.copydefault(context, java.lang.Integer.valueOf(C45528sri.EZpvd(str != null ? str : ""))));
    }
}
