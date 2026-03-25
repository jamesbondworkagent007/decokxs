package o;

import com.okinc.business.defi.dapp.base.FragmentNavigator;
import com.okinc.business.defi.dapp.bridge.DappBridge;
import com.okinc.rxutils.RxBus;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14865dtX extends C14866dtY {
    public static final TaskDescription Companion = new TaskDescription(null);

    @Override // o.C14866dtY, o.InterfaceC15111dyE
    public boolean az_() {
        return false;
    }

    @Override // o.AbstractC14833dss, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        EZpvd(false);
    }

    @Override // o.AbstractC43061riF, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(DappBridge.EVENT_KEY_CLOSE_DAPP_NEW_SEARCH_PAGE);
        final Function1 function1 = new Function1() { // from class: o.dtW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14865dtX.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dtV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14865dtX.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, KWHzl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C14865dtX c14865dtX, java.lang.String str) {
        android.os.Bundle arguments = c14865dtX.getArguments();
        androidx.fragment.app.FragmentManager fragmentManagerCopydefault = C15148dyp.copydefault.copydefault(java.lang.String.valueOf(arguments != null ? java.lang.Long.valueOf(arguments.getLong("rootPage")) : null));
        if (fragmentManagerCopydefault != null) {
            FragmentNavigator.StateListAnimator.from$default(FragmentNavigator.Companion, fragmentManagerCopydefault, null, 2, null).OLrzqt(c14865dtX, new FragmentNavigator.Application(C52761wXj.Application.EZpvd, C52761wXj.Application.copydefault, 0, 0, false, false, null, null, false, false, 1008, null));
        }
        c14865dtX.EZpvd(true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(z);
    }

    /* JADX INFO: renamed from: o.dtX$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C14865dtX KWHzl(@NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            android.os.Bundle bundleEZpvd;
            Intrinsics.checkNotNullParameter(str, "");
            C14865dtX c14865dtX = new C14865dtX();
            if (map != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
                for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                    arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
                }
                kotlin.Pair[] pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
                if (pairArr != null && (bundleEZpvd = C33048mpB.EZpvd(pairArr)) != null) {
                    c14865dtX.setArguments(bundleEZpvd);
                }
            }
            if (c14865dtX.getArguments() == null) {
                c14865dtX.setArguments(new android.os.Bundle());
            }
            android.os.Bundle arguments = c14865dtX.getArguments();
            if (arguments != null) {
                arguments.putString("to", str);
            }
            return c14865dtX;
        }
    }
}
