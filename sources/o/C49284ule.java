package o;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C32986mnt;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ule, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49284ule {
    public final android.os.Handler KWHzl = new android.os.Handler(android.os.Looper.getMainLooper());

    public final void copydefault(long j, @NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        this.KWHzl.postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: o.ule$ActionBar */
    public static final class ActionBar implements C32986mnt.Application {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;
        public final /* synthetic */ Ref.ObjectRef<AtomicBoolean> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Ref.ObjectRef<AtomicBoolean> objectRef, Function1<? super java.lang.Boolean, Unit> function1) {
            this.OLrzqt = objectRef;
            this.KWHzl = function1;
        }

        @Override // o.C32986mnt.Application
        public void AEQbTJ() {
            pUU.valueOf("Share", "onEnterForeground-->");
        }

        @Override // o.C32986mnt.Application
        public void OLrzqt() {
            this.OLrzqt.element.set(true);
            this.KWHzl.invoke(java.lang.Boolean.valueOf(this.OLrzqt.element.get()));
            pUU.valueOf("Share", "onEnterBackground-->");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.concurrent.atomic.AtomicBoolean] */
    public final void KWHzl(long j, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new AtomicBoolean(false);
        final ActionBar actionBar = new ActionBar(objectRef, function1);
        C32986mnt.EZpvd.copydefault(actionBar);
        copydefault(j, new java.lang.Runnable() { // from class: o.ulh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49284ule.KWHzl(actionBar, objectRef, function1);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(ActionBar actionBar, Ref.ObjectRef objectRef, Function1 function1) {
        C32986mnt.EZpvd.KWHzl(actionBar);
        if (!((AtomicBoolean) objectRef.element).get()) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        pUU.valueOf("Share", "delay check-->isEnterBackground:" + ((AtomicBoolean) objectRef.element).get());
    }

    public final boolean KWHzl() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        if (C59449zhJ.gEmmrt(str, "HUAWEI", true) || C59449zhJ.gEmmrt(str, "HONOR", true)) {
            return true;
        }
        java.lang.String str2 = android.os.Build.BRAND;
        return C59449zhJ.gEmmrt(str2, "HUAWEI", true) || C59449zhJ.gEmmrt(str2, "HONOR", true);
    }

    public final void OLrzqt() {
        if (KWHzl()) {
            KWHzl(3000L, new Function1() { // from class: o.uli
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49284ule.copydefault(((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit copydefault(boolean z) {
        if (!z) {
            C55326xho.toast$default(C32979mnm.EZpvd.OLrzqt().getResources().getString(C48931uew.Activity.djBIcL), (android.graphics.drawable.Drawable) null, 1, (java.lang.Integer) 17, 0, 0, 25, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
