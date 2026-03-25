package o;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C57656ymY;
import o.C57657ymZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57656ymY {
    public static mAI AhwBna;
    public static C57657ymZ KWHzl;
    public static final C57656ymY OLrzqt = new C57656ymY();
    public static java.util.ArrayList<android.view.View> AEQbTJ = new java.util.ArrayList<>();
    public static final C55336xhy valueOf = new C55336xhy();
    public static long djBIcL = 1000;
    public static java.util.ArrayList<android.view.View> gEmmrt = new java.util.ArrayList<>();
    public static final android.content.BroadcastReceiver copydefault = new Activity();
    public static android.os.Handler AYXKKw = new ActionBar(android.os.Looper.getMainLooper());
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull C55097xdX c55097xdX, long j) {
        Intrinsics.checkNotNullParameter(c55097xdX, "");
        showNotificationViewWithToast$default(this, c55097xdX, j, 0, 0, 0, 28, null);
    }

    private C57656ymY() {
    }

    /* JADX INFO: renamed from: o.ymY$Activity */
    public static final class Activity extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (Intrinsics.EZpvd((java.lang.Object) "android.intent.action.CLOSE_SYSTEM_DIALOGS", (java.lang.Object) (intent != null ? intent.getAction() : null))) {
                C57656ymY.OLrzqt.valueOf();
            }
        }
    }

    /* JADX INFO: renamed from: o.ymY$ActionBar */
    public static final class ActionBar extends android.os.Handler {
        public ActionBar(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            super.handleMessage(message);
            C57656ymY.OLrzqt.OLrzqt(message);
        }
    }

    public final void OLrzqt(@NotNull C55097xdX c55097xdX, long j, int i, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(c55097xdX, "");
        valueOf.OLrzqt(z);
        copydefault(c55097xdX, j, i, i2, i3);
    }

    public static /* synthetic */ void showNotificationViewWithToast$default(C57656ymY c57656ymY, C55097xdX c55097xdX, long j, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            j = 5000;
        }
        long j2 = j;
        if ((i4 & 4) != 0) {
            i = 48;
        }
        c57656ymY.copydefault(c55097xdX, j2, i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, android.app.Activity] */
    public final void copydefault(@NotNull C55097xdX c55097xdX, long j, int i, int i2, int i3) {
        C57657ymZ c57657ymZ;
        Intrinsics.checkNotNullParameter(c55097xdX, "");
        AEQbTJ.add(c55097xdX);
        final android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = c55097xdX.hashCode();
        long jCopydefault = C56548yJl.copydefault(1000L, j);
        djBIcL = jCopydefault;
        if (KWHzl == null) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? OLrzqt2 = C33569myt.OLrzqt(c55097xdX.getContext());
            objectRef.element = OLrzqt2;
            if (OLrzqt2 == 0) {
                objectRef.element = C54819xWm.KWHzl().AEQbTJ();
            }
            T t = objectRef.element;
            if (t == 0) {
                return;
            }
            c55097xdX.setLayoutDirection(C55296xhK.AEQbTJ((android.content.Context) t));
            C55336xhy c55336xhy = valueOf;
            if (!c55336xhy.copydefault() && OLrzqt((android.app.Activity) objectRef.element)) {
                AYXKKw.sendMessageDelayed(messageObtain, djBIcL);
                if (AhwBna == null) {
                    mAI mai = new mAI((android.content.Context) objectRef.element, c55336xhy, i, i2, i3);
                    AhwBna = mai;
                    Intrinsics.copydefault(mai);
                    mai.AEQbTJ(new TaskDescription(c55097xdX));
                    mAI mai2 = AhwBna;
                    Intrinsics.copydefault(mai2);
                    mai2.KWHzl();
                    AYXKKw();
                    return;
                }
                c55336xhy.EZpvd(c55097xdX, false);
                return;
            }
            C57657ymZ c57657ymZ2 = new C57657ymZ(c55336xhy, i, i2, i3);
            KWHzl = c57657ymZ2;
            c57657ymZ2.OLrzqt(new Application(c55097xdX));
            T t2 = objectRef.element;
            if (t2 instanceof FragmentActivity) {
                if (((FragmentActivity) t2).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    AYXKKw.sendMessageDelayed(messageObtain, djBIcL);
                    C57657ymZ c57657ymZ3 = KWHzl;
                    if ((c57657ymZ3 == null || !c57657ymZ3.KWHzl()) && (c57657ymZ = KWHzl) != null) {
                        androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) objectRef.element).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        c57657ymZ.show(supportFragmentManager, C57657ymZ.class.getSimpleName());
                    }
                } else {
                    ((FragmentActivity) objectRef.element).getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.widget.toast.MultipleToastManager$showNotificationViewWithToast$3
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            C57657ymZ c57657ymZ4;
                            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                            Intrinsics.checkNotNullParameter(event, "");
                            if (event == Lifecycle.Event.ON_RESUME) {
                                ((FragmentActivity) objectRef.element).getLifecycle().removeObserver(this);
                                C57656ymY.AYXKKw.sendMessageDelayed(messageObtain, C57656ymY.djBIcL);
                                C57657ymZ c57657ymZ5 = C57656ymY.KWHzl;
                                if ((c57657ymZ5 == null || !c57657ymZ5.KWHzl()) && (c57657ymZ4 = C57656ymY.KWHzl) != null) {
                                    FragmentManager supportFragmentManager2 = ((FragmentActivity) objectRef.element).getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                                    c57657ymZ4.show(supportFragmentManager2, C57657ymZ.class.getSimpleName());
                                }
                            }
                        }
                    });
                }
                AYXKKw();
                return;
            }
            try {
                valueOf();
                return;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return;
            }
        }
        AYXKKw.sendMessageDelayed(messageObtain, jCopydefault);
        C55336xhy c55336xhy2 = valueOf;
        if (c55336xhy2.valueOf() == null) {
            gEmmrt.add(c55097xdX);
        } else {
            C55336xhy.addNewView$default(c55336xhy2, c55097xdX, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: o.ymY$TaskDescription */
    public static final class TaskDescription implements InterfaceC31682mAP {
        public final /* synthetic */ C55097xdX AEQbTJ;

        public TaskDescription(C55097xdX c55097xdX) {
            this.AEQbTJ = c55097xdX;
        }

        @Override // o.InterfaceC31682mAP
        public void EZpvd() {
            this.AEQbTJ.requestLayout();
            C57656ymY.valueOf.EZpvd(this.AEQbTJ, true);
        }
    }

    /* JADX INFO: renamed from: o.ymY$Application */
    public static final class Application implements InterfaceC31682mAP {
        public final /* synthetic */ C55097xdX copydefault;

        public Application(C55097xdX c55097xdX) {
            this.copydefault = c55097xdX;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.xhy.addNewView$default(o.xhy, android.view.View, boolean, int, java.lang.Object):void */
        @Override // o.InterfaceC31682mAP
        public void EZpvd() {
            C55336xhy.addNewView$default(C57656ymY.valueOf, this.copydefault, false, 2, null);
            java.util.Iterator it = C57656ymY.gEmmrt.iterator();
            while (it.hasNext()) {
                C55336xhy.addNewView$default(C57656ymY.valueOf, (android.view.View) it.next(), false, 2, null);
            }
            C57656ymY.gEmmrt.clear();
        }
    }

    public final void OLrzqt(android.os.Message message) {
        android.view.View view = null;
        if (valueOf.gEmmrt()) {
            AYXKKw.removeCallbacksAndMessages(null);
            return;
        }
        for (android.view.View view2 : AEQbTJ) {
            if (view2.hashCode() == message.what) {
                view = view2;
            }
        }
        if (view != null) {
            AEQbTJ.remove(view);
            valueOf.AEQbTJ(view);
        }
        if (AEQbTJ.isEmpty()) {
            valueOf();
        }
    }

    public final boolean OLrzqt(android.app.Activity activity) {
        if (activity != null) {
            return C8116awf.copydefault(activity);
        }
        return C8116awf.copydefault(C52762wXk.AEQbTJ());
    }

    public final void valueOf() {
        android.view.ViewGroup viewGroupKWHzl;
        AEQbTJ.clear();
        C55336xhy c55336xhy = valueOf;
        c55336xhy.KWHzl();
        C55288xhC c55288xhCValueOf = c55336xhy.valueOf();
        if (c55288xhCValueOf != null && (viewGroupKWHzl = c55288xhCValueOf.KWHzl()) != null) {
            viewGroupKWHzl.setVisibility(8);
        }
        AYXKKw.removeCallbacksAndMessages(null);
        C57657ymZ c57657ymZ = KWHzl;
        if (c57657ymZ != null && c57657ymZ.isAdded()) {
            c57657ymZ.dismissAllowingStateLoss();
        }
        KWHzl = null;
        mAI mai = AhwBna;
        if (mai != null) {
            mai.copydefault();
        }
        AhwBna = null;
        djBIcL();
    }

    public final void AhwBna() {
        valueOf.AEQbTJ();
    }

    public final void KWHzl(@NotNull C55097xdX c55097xdX) {
        Intrinsics.checkNotNullParameter(c55097xdX, "");
        valueOf.AEQbTJ(c55097xdX);
    }

    public final void AYXKKw() {
        ContextCompat.registerReceiver(C52762wXk.AEQbTJ(), copydefault, new android.content.IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), 2);
    }

    public final void djBIcL() {
        try {
            C52762wXk.AEQbTJ().unregisterReceiver(copydefault);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
