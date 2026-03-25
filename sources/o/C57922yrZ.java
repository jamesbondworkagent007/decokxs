package o;

import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yrZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57922yrZ {
    public static final ActionBar Companion = new ActionBar(null);
    public static volatile boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AEQbTJ(@androidx.annotation.NonNull @NotNull android.app.Application application, @NotNull C57921yrY c57921yrY) {
        Companion.OLrzqt(application, c57921yrY);
    }

    /* JADX INFO: renamed from: o.yrZ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yrZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void OLrzqt(@androidx.annotation.NonNull @NotNull android.app.Application application, @NotNull C57921yrY c57921yrY) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(c57921yrY, "");
            if (C57922yrZ.KWHzl) {
                return;
            }
            C57922yrZ.KWHzl = true;
            if (AEQbTJ()) {
                C58013ytK.OLrzqt("Matrix.ProcessLifecycleOwnerInit", "Matrix Warning: Matrix might be inited after launching first Activity, which would disable some features like ProcessLifecycleOwner, pls consider calling MultiProcessLifecycleInitializer#init manually or initializing matrix at Application#onCreate", new java.lang.Object[0]);
                return;
            }
            MatrixLifecycleThread.EZpvd.AEQbTJ(c57921yrY.AEQbTJ());
            C58001ysz.AEQbTJ.copydefault(application);
            C57982ysg.EZpvd.KWHzl(application, c57921yrY.copydefault());
            C57987ysl.EZpvd.OLrzqt(c57921yrY.EZpvd());
            C57920yrX.KWHzl.copydefault(application, c57921yrY.KWHzl());
        }

        public final boolean AEQbTJ() {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
                java.lang.Object objInvoke = cls.getMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                java.lang.reflect.Field declaredField = cls.getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                java.util.Map map = (java.util.Map) declaredField.get(objInvoke);
                if (map != null) {
                    return map.isEmpty() ^ true;
                }
                return false;
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.ProcessLifecycleOwnerInit", th, "", new java.lang.Object[0]);
                return false;
            }
        }
    }
}
