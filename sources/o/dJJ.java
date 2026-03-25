package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC54829xWw;
import o.dTK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJJ {
    public static final dJJ copydefault = new dJJ();

    private dJJ() {
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(android.content.Context context, java.lang.String str, android.os.Bundle bundle, java.util.Map map, boolean z, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.copydefault(abstractC12782ctV);
        if (C17922fXg.EZpvd(abstractC12782ctV) instanceof dTK.Application) {
            C55326xho.toast$default(C13754dXa.FragmentManager.getOnBackPressedDispatcherannotations, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            copydefault.EZpvd(context, str, bundle, map, z);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull android.os.Bundle bundle, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z) {
        java.lang.Object obj;
        AbstractActivityC33041mov abstractActivityC33041mov;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(map, "");
        bundle.putString("url", str);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wallet/history/detail", false, 2, (java.lang.Object) null) && z) {
            ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).KWHzl(context, bundle);
            return;
        }
        try {
            pUU.copydefault("DefiDeeplinkUtils", "url = " + str + " : params = " + map);
            java.lang.Object obj2 = map.get("source");
            if (obj2 != null) {
                boolean z2 = true;
                if (!obj2.equals("1")) {
                    z2 = false;
                }
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wallet/teeAccount/statusPage", false, 2, (java.lang.Object) null) && z && !z2) {
                    ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).copydefault(context, bundle);
                    return;
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wallet/home/scan", false, 2, (java.lang.Object) null) && z) {
            if (context instanceof AbstractActivityC33041mov) {
                abstractActivityC33041mov = (AbstractActivityC33041mov) context;
            } else {
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                abstractActivityC33041mov = activityAEQbTJ instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityAEQbTJ : null;
            }
            if (abstractActivityC33041mov != null) {
                androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C18061fbL.EZpvd(abstractActivityC33041mov, supportFragmentManager);
                return;
            }
        }
        if (((StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wc:", false, 2, (java.lang.Object) null) && C59449zhJ.startsWith$default(str, "wc:", false, 2, null)) || C59449zhJ.startsWith$default(str, "tc://", false, 2, null)) && (context instanceof android.app.Activity) && (obj = bundle.get("referrer")) != null) {
            bundle.putString("origin", obj.toString());
        }
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        if (activityOLrzqt != null) {
            InterfaceC54829xWw.ActionBar.enterWallet$default((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class), activityOLrzqt, bundle, false, !z, false, 20, null);
        }
        if (z) {
            return;
        }
        java.util.Iterator<T> it = C32979mnm.EZpvd.KWHzl().iterator();
        while (it.hasNext()) {
            android.app.Activity activity = (android.app.Activity) ((WeakReference) it.next()).get();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        java.lang.String str2 = ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).wlaJM() + "wallet/" + str;
        return (pairArr.length == 0) ^ true ? copydefault(str2, (kotlin.Pair<java.lang.String, ? extends java.lang.Object>[]) java.util.Arrays.copyOf(pairArr, pairArr.length)) : str2;
    }

    public static final java.lang.CharSequence copydefault(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return pair.getFirst() + ContainerUtils.KEY_VALUE_DELIMITER + pair.getSecond();
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        java.lang.StringBuilder sb;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        java.lang.String strJoinToString$default = yDV.joinToString$default(pairArr, ContainerUtils.FIELD_DELIMITER, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1() { // from class: o.dJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dJJ.copydefault((kotlin.Pair) obj);
            }
        }, 30, (java.lang.Object) null);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "?", false, 2, (java.lang.Object) null)) {
            sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(ContainerUtils.FIELD_DELIMITER);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("?");
        }
        sb.append(strJoinToString$default);
        return sb.toString();
    }

    public final void OLrzqt(@NotNull final android.content.Context context, @NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, ? extends java.lang.Object> map, final boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
        }
        final android.os.Bundle bundleEZpvd = C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]));
        if (xZT.EZpvd.copydefault().contains(str)) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final Function1 function1 = new Function1() { // from class: o.dJQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dJJ.EZpvd(context, str, bundleEZpvd, map, z, (AbstractC12782ctV) obj);
                }
            };
            abstractC58260yxtCopydefault.copydefault(new InterfaceC58227yxM() { // from class: o.dJN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dJJ.copydefault(function1, obj);
                }
            });
            return;
        }
        EZpvd(context, str, bundleEZpvd, map, z);
    }
}
