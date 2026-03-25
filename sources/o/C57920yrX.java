package o;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56529yIt;
import o.C57920yrX;
import o.C58013ytK;
import o.InterfaceC57909yrM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yrX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57920yrX {
    public static android.app.Application AEQbTJ;
    public static final C57920yrX KWHzl = new C57920yrX();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0<java.lang.String>() { // from class: com.tencent.matrix.lifecycle.MatrixLifecycleLogger$TAG$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("Matrix.Logger_");
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format("%-10.10s", Arrays.copyOf(new Object[]{C57920yrX.KWHzl.KWHzl()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            sb.append(str);
            return sb.toString();
        }
    });

    private C57920yrX() {
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) copydefault.getValue();
    }

    public final java.lang.String KWHzl() throws java.lang.Throwable {
        android.app.Application application = AEQbTJ;
        Intrinsics.copydefault(application);
        if (C58014ytL.AEQbTJ(application)) {
            return "Main";
        }
        android.app.Application application2 = AEQbTJ;
        Intrinsics.copydefault(application2);
        java.lang.String strOLrzqt = C58014ytL.OLrzqt(application2);
        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
        java.lang.String[] strArr = (java.lang.String[]) StringsKt__StringsKt.split$default((java.lang.CharSequence) strOLrzqt, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
        return strArr.length > 1 ? C59454zhO.isConnected(strArr[1], 10) : "unknown";
    }

    public final void copydefault(@NotNull android.app.Application application, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        AEQbTJ = application;
        if (!z) {
            C58013ytK.EZpvd(OLrzqt(), "logger disabled", new java.lang.Object[0]);
            return;
        }
        C57959ysJ.AEQbTJ.KWHzl(new StateListAnimator());
        C57958ysI.AEQbTJ.KWHzl(new TaskDescription());
        C57993ysr.AEQbTJ.KWHzl(new ActionBar());
        C57995yst.EZpvd.KWHzl(new LoaderManager());
        C57996ysu.AEQbTJ.KWHzl(new PendingIntent());
        C57962ysM.copydefault.KWHzl(new Dialog());
        C57956ysG.AEQbTJ.KWHzl(new FragmentManager());
        C57961ysL.AEQbTJ.KWHzl(new Fragment());
        C57955ysF.KWHzl.KWHzl(new SharedElementCallback());
        C57968ysS c57968ysS = C57968ysS.KWHzl;
        c57968ysS.AEQbTJ(new yHO<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean>() { // from class: com.tencent.matrix.lifecycle.MatrixLifecycleLogger$init$10
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.yHO
            public final Boolean invoke(String str, String str2, Integer num) {
                C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "Dying Listener: process " + num + '-' + str2 + " is dying on scene " + str, new Object[0]);
                return Boolean.FALSE;
            }
        });
        c57968ysS.AEQbTJ(new yHT<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, Unit>() { // from class: com.tencent.matrix.lifecycle.MatrixLifecycleLogger$init$11
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Integer num, Boolean bool) {
                invoke2(str, str2, num, bool);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str, String str2, Integer num, Boolean bool) {
                C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "Death Listener: process " + num + '-' + str2 + " died on scene " + str + ", is LRU Kill? " + bool, new Object[0]);
            }
        });
        C57982ysg.EZpvd.KWHzl(new Activity());
        C57987ysl.EZpvd.KWHzl(new Application());
    }

    /* JADX INFO: renamed from: o.yrX$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_UI_RESUMED", new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_UI_PAUSED", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$TaskDescription */
    public static final class TaskDescription implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_UI_STARTED scene: " + C58001ysz.AEQbTJ.values(), new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_UI_STOPPED scene: " + C58001ysz.AEQbTJ.values(), new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$ActionBar */
    public static final class ActionBar implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_ENTER_EXPLICIT_BACKGROUND", new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_EXIT_EXPLICIT_BACKGROUND", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$LoaderManager */
    public static final class LoaderManager implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_ENTER_STAGED_BACKGROUND", new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_EXIT_STAGED_BACKGROUND", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$PendingIntent */
    public static final class PendingIntent implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_ENTER_DEEP_BACKGROUND", new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_PROCESS_EXIT_DEEP_BACKGROUND", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$Dialog */
    public static final class Dialog implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_APP_UI_ENTER_FOREGROUND scene: " + C57968ysS.KWHzl.OLrzqt(), new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_APP_UI_EXIT_FOREGROUND scene: " + C57968ysS.KWHzl.OLrzqt(), new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$FragmentManager */
    public static final class FragmentManager implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_APP_EXIT_EXPLICIT_BACKGROUND", new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_APP_ENTER_EXPLICIT_BACKGROUND", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$Fragment */
    public static final class Fragment implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_APP_EXIT_STAGED_BACKGROUND", new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_APP_ENTER_STAGED_BACKGROUND", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$SharedElementCallback */
    public static final class SharedElementCallback implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_APP_EXIT_DEEP_BACKGROUND", new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ON_APP_ENTER_DEEP_BACKGROUND", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$Activity */
    public static final class Activity implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ForegroundServiceLifecycleOwner: ON", new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            C58013ytK.EZpvd(C57920yrX.KWHzl.OLrzqt(), "ForegroundServiceLifecycleOwner: OFF", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: renamed from: o.yrX$Application */
    public static final class Application implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            java.lang.String strOLrzqt = C57920yrX.KWHzl.OLrzqt();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("OverlayWindowLifecycleOwner: ON, hasOverlay = ");
            C57987ysl c57987ysl = C57987ysl.EZpvd;
            sb.append(c57987ysl.AYXKKw());
            sb.append(", hasVisible = ");
            sb.append(c57987ysl.AhwBna());
            C58013ytK.EZpvd(strOLrzqt, sb.toString(), new java.lang.Object[0]);
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            java.lang.String strOLrzqt = C57920yrX.KWHzl.OLrzqt();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("OverlayWindowLifecycleOwner: OFF, hasOverlay = ");
            C57987ysl c57987ysl = C57987ysl.EZpvd;
            sb.append(c57987ysl.AYXKKw());
            sb.append(", hasVisible = ");
            sb.append(c57987ysl.AhwBna());
            C58013ytK.EZpvd(strOLrzqt, sb.toString(), new java.lang.Object[0]);
        }
    }
}
