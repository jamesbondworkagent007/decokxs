package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ViewOnClickListenerC18449fic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fid, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18450fid extends AbstractDialogInterfaceOnKeyListenerC57208yeA {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public InterfaceC9730bbB EZpvd;
    public boolean KWHzl;
    public InterfaceC9736bbH OLrzqt;

    /* JADX INFO: renamed from: o.fid$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fid.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C18450fid EZpvd(@NotNull InterfaceC9730bbB interfaceC9730bbB, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC9730bbB, "");
            C18450fid c18450fid = new C18450fid();
            c18450fid.EZpvd = interfaceC9730bbB;
            c18450fid.KWHzl = z;
            return c18450fid;
        }

        public final C18450fid AEQbTJ(@NotNull InterfaceC9736bbH interfaceC9736bbH, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC9736bbH, "");
            C18450fid c18450fid = new C18450fid();
            c18450fid.OLrzqt = interfaceC9736bbH;
            c18450fid.KWHzl = z;
            return c18450fid;
        }
    }

    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ViewOnClickListenerC18449fic viewOnClickListenerC18449ficAEQbTJ;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        InterfaceC9730bbB interfaceC9730bbB = this.EZpvd;
        if (interfaceC9730bbB == null && !this.KWHzl) {
            AbstractDialogInterfaceOnKeyListenerC57208yeA.close$default(this, null, 1, null);
            return;
        }
        InterfaceC9736bbH interfaceC9736bbH = this.OLrzqt;
        if (interfaceC9736bbH == null && this.KWHzl) {
            AbstractDialogInterfaceOnKeyListenerC57208yeA.close$default(this, null, 1, null);
            return;
        }
        if (this.KWHzl) {
            ViewOnClickListenerC18449fic.Application application = ViewOnClickListenerC18449fic.Companion;
            Intrinsics.copydefault(interfaceC9736bbH);
            viewOnClickListenerC18449ficAEQbTJ = application.KWHzl(interfaceC9736bbH, this.KWHzl);
        } else {
            ViewOnClickListenerC18449fic.Application application2 = ViewOnClickListenerC18449fic.Companion;
            Intrinsics.copydefault(interfaceC9730bbB);
            viewOnClickListenerC18449ficAEQbTJ = application2.AEQbTJ(interfaceC9730bbB, this.KWHzl);
        }
        C57211yeD c57211yeDKWHzl = KWHzl();
        if (c57211yeDKWHzl != null) {
            c57211yeDKWHzl.AEQbTJ(null, viewOnClickListenerC18449ficAEQbTJ, false, true);
        }
    }
}
