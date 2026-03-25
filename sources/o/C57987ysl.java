package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.tencent.matrix.lifecycle.owners.ArrayListProxy;
import com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$onViewRootChangedListener$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C57987ysl;
import o.C58013ytK;
import o.C58017ytO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57987ysl extends C57983ysh {
    public static java.util.ArrayList<?> AEQbTJ;
    public static volatile boolean AhwBna;
    public static volatile boolean valueOf;
    public static final C57987ysl EZpvd = new C57987ysl();
    public static final java.util.HashSet<java.lang.Object> values = new java.util.HashSet<>();
    public static final android.os.Handler djBIcL = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0<C58017ytO<android.view.View>>() { // from class: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$Field_ViewRootImpl_mView$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final C58017ytO<View> invoke() {
            C57987ysl c57987ysl = C57987ysl.EZpvd;
            try {
                return new C58017ytO<>(Class.forName("android.view.ViewRootImpl"), "mView");
            } catch (Throwable th) {
                C58013ytK.OLrzqt("Matrix.OverlayWindowLifecycleOwner", th, "", new Object[0]);
                return null;
            }
        }
    });
    public static final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0<OverlayWindowLifecycleOwner$onViewRootChangedListener$2.AnonymousClass1>() { // from class: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$onViewRootChangedListener$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AnonymousClass1 invoke() {
            return new AnonymousClass1();
        }

        /* JADX INFO: renamed from: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$onViewRootChangedListener$2$1, reason: invalid class name */
        public static final class AnonymousClass1 implements ArrayListProxy.Activity {
            @Override // com.tencent.matrix.lifecycle.owners.ArrayListProxy.Activity
            public void KWHzl(@NotNull final Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                C57987ysl.djBIcL.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: INVOKE 
                      (wrap:android.os.Handler:0x0005: SGET  A[MD:():android.os.Handler (m), WRAPPED] (LINE:55) o.ysl.djBIcL android.os.Handler)
                      (wrap:java.lang.Runnable:0x000b: CONSTRUCTOR 
                      (r2v0 'this' com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$onViewRootChangedListener$2$1 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
                      (r3v0 'obj' java.lang.Object A[DONT_INLINE])
                     A[MD:(com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$onViewRootChangedListener$2$1, java.lang.Object):void (m), WRAPPED] call: o.ysp.<init>(com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$onViewRootChangedListener$2$1, java.lang.Object):void type: CONSTRUCTOR)
                     VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (c)] (LINE:55) in method: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$onViewRootChangedListener$2.1.KWHzl(java.lang.Object):void, file: classes12.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.ysp, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 15 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = ""
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    android.os.Handler r0 = o.C57987ysl.OLrzqt()
                    o.ysp r1 = new o.ysp
                    r1.<init>(r2, r3)
                    r0.post(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$onViewRootChangedListener$2.AnonymousClass1.KWHzl(java.lang.Object):void");
            }

            public static final void AEQbTJ(AnonymousClass1 anonymousClass1, Object obj) {
                ViewGroup.LayoutParams layoutParams;
                Intrinsics.checkNotNullParameter(anonymousClass1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                View view = null;
                try {
                    C58017ytO c58017ytOKWHzl = C57987ysl.EZpvd.KWHzl();
                    View view2 = c58017ytOKWHzl != null ? (View) c58017ytOKWHzl.AEQbTJ(obj) : null;
                    Intrinsics.copydefault(view2, "");
                    view = view2;
                } catch (Throwable th) {
                    C58013ytK.OLrzqt("Matrix.OverlayWindowLifecycleOwner", th, "", new Object[0]);
                }
                if (view == null || (layoutParams = view.getLayoutParams()) == null) {
                    return;
                }
                C57987ysl c57987ysl = C57987ysl.EZpvd;
                if (c57987ysl.KWHzl(layoutParams)) {
                    if (C57987ysl.values.isEmpty()) {
                        c57987ysl.valueOf();
                    }
                    C57987ysl.values.add(obj);
                }
            }

            @Override // com.tencent.matrix.lifecycle.owners.ArrayListProxy.Activity
            public void EZpvd(@NotNull Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                C57987ysl.values.remove(obj);
                if (C57987ysl.values.isEmpty()) {
                    C57987ysl.EZpvd.djBIcL();
                }
            }
        }
    });

    private C57987ysl() {
        super(false, 1, null);
    }

    public final C58017ytO<android.view.View> KWHzl() {
        return (C58017ytO) OLrzqt.getValue();
    }

    public final void OLrzqt(boolean z) {
        if (!z) {
            C58013ytK.EZpvd("Matrix.OverlayWindowLifecycleOwner", "disabled", new java.lang.Object[0]);
        } else {
            DbNXlk();
        }
    }

    public final boolean KWHzl(ViewGroup.LayoutParams layoutParams) {
        int i;
        return (layoutParams instanceof WindowManager.LayoutParams) && (Build.VERSION.SDK_INT < 26 ? ((WindowManager.LayoutParams) layoutParams).type == 2002 : (i = ((WindowManager.LayoutParams) layoutParams).type) == 2038 || i == 2002);
    }

    public final ArrayListProxy.Activity gEmmrt() {
        return (ArrayListProxy.Activity) gEmmrt.getValue();
    }

    public final C57987ysl DbNXlk() {
        try {
            if (AhwBna) {
                C58013ytK.OLrzqt("Matrix.OverlayWindowLifecycleOwner", "already injected", new java.lang.Object[0]);
            } else {
                java.lang.Class<?> cls = java.lang.Class.forName("android.view.WindowManagerGlobal");
                java.lang.Object objEZpvd = C58020ytR.EZpvd(cls, "getInstance", null, new java.lang.Object[0]);
                java.lang.Object objKWHzl = C58020ytR.KWHzl(cls, "mLock", objEZpvd);
                Intrinsics.checkNotNullExpressionValue(objKWHzl, "");
                synchronized (objKWHzl) {
                    ArrayListProxy arrayListProxy = new ArrayListProxy((java.util.ArrayList) C58020ytR.KWHzl(cls, "mRoots", objEZpvd), gEmmrt());
                    C58020ytR.copydefault(cls, "mRoots", objEZpvd, arrayListProxy);
                    AEQbTJ = arrayListProxy;
                    Unit unit = Unit.INSTANCE;
                }
                AhwBna = true;
            }
        } catch (java.lang.Throwable th) {
            C58013ytK.OLrzqt("Matrix.OverlayWindowLifecycleOwner", th, "", new java.lang.Object[0]);
        }
        return this;
    }

    public final void fetchVPNInfo() throws java.lang.ClassNotFoundException {
        if (AEQbTJ == null) {
            if (valueOf) {
                throw new java.lang.ClassNotFoundException("WindowManagerGlobal_mRoots not found");
            }
            C58013ytK.EZpvd("Matrix.OverlayWindowLifecycleOwner", "monitor disabled, fallback init", new java.lang.Object[0]);
            valueOf = true;
            java.util.ArrayList<?> arrayList = null;
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.view.WindowManagerGlobal");
                arrayList = (java.util.ArrayList) C58020ytR.KWHzl(cls, "mRoots", C58020ytR.EZpvd(cls, "getInstance", null, new java.lang.Object[0]));
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.OverlayWindowLifecycleOwner", th, "", new java.lang.Object[0]);
            }
            AEQbTJ = arrayList;
        }
        if (AEQbTJ == null) {
            throw new java.lang.ClassNotFoundException("WindowManagerGlobal_mRoots not found");
        }
        if (KWHzl() == null) {
            throw new java.lang.ClassNotFoundException("Field_ViewRootImpl_mView not found");
        }
    }

    public final boolean AhwBna() {
        try {
            EZpvd.fetchVPNInfo();
            java.util.ArrayList<?> arrayList = AEQbTJ;
            Intrinsics.copydefault(arrayList);
            if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
                return false;
            }
            for (java.lang.Object obj : arrayList) {
                C58017ytO<android.view.View> c58017ytOKWHzl = EZpvd.KWHzl();
                Intrinsics.copydefault(c58017ytOKWHzl);
                android.view.View viewAEQbTJ = c58017ytOKWHzl.AEQbTJ(obj);
                if (viewAEQbTJ != null && viewAEQbTJ.getVisibility() == 0 && viewAEQbTJ.getWindowVisibility() == 0) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            C58013ytK.OLrzqt("Matrix.OverlayWindowLifecycleOwner", th, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean AYXKKw() {
        ViewGroup.LayoutParams layoutParams;
        if (AhwBna) {
            return AEQbTJ();
        }
        try {
            EZpvd.fetchVPNInfo();
            java.util.ArrayList<?> arrayList = AEQbTJ;
            Intrinsics.copydefault(arrayList);
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                for (java.lang.Object obj : arrayList) {
                    C57987ysl c57987ysl = EZpvd;
                    C58017ytO<android.view.View> c58017ytOKWHzl = c57987ysl.KWHzl();
                    Intrinsics.copydefault(c58017ytOKWHzl);
                    android.view.View viewAEQbTJ = c58017ytOKWHzl.AEQbTJ(obj);
                    if (viewAEQbTJ != null && (layoutParams = viewAEQbTJ.getLayoutParams()) != null) {
                        Intrinsics.checkNotNullExpressionValue(layoutParams, "");
                        if (c57987ysl.KWHzl(layoutParams) && viewAEQbTJ.getVisibility() == 0 && viewAEQbTJ.getWindowVisibility() == 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            C58013ytK.OLrzqt("Matrix.OverlayWindowLifecycleOwner", th, "", new java.lang.Object[0]);
        }
        return false;
    }
}
