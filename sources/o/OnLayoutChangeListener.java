package o;

import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OnLayoutChangeListener {
    public static final byte[] AEQbTJ(DT dt, final OnContextClickListener onContextClickListener) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX(CoreNetworkModuleKt.KEY_CLIENT_ID));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("clientSecret"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("code"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("deviceCode"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("grantType"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("redirectUri"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("refreshToken"));
        C5101Et c5101Et8 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("scope"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = onContextClickListener.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
        }
        java.lang.String strCopydefault = onContextClickListener.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        java.lang.String strAEQbTJ = onContextClickListener.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        java.lang.String strEZpvd = onContextClickListener.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strEZpvd);
        }
        java.lang.String strOLrzqt = onContextClickListener.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strOLrzqt);
        }
        java.lang.String strDjBIcL = onContextClickListener.djBIcL();
        if (strDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et6, strDjBIcL);
        }
        java.lang.String strGEmmrt = onContextClickListener.gEmmrt();
        if (strGEmmrt != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strGEmmrt);
        }
        if (onContextClickListener.valueOf() != null) {
            ebEZpvd.EZpvd(c5101Et8, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.serde.CreateTokenOperationSerializerKt$serializeCreateTokenOperationBody$1$8
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5094Em interfaceC5094Em) {
                    invoke2(interfaceC5094Em);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<String> it = onContextClickListener.valueOf().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
