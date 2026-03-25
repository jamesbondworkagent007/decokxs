package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hbQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22227hbQ extends android.widget.FrameLayout {
    public Function1<? super java.util.List<C20064gZo>, Unit> AEQbTJ;
    public C20069gZt EZpvd;
    public final hGQ KWHzl;
    public Function1<? super java.util.List<C20064gZo>, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22227hbQ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCancelAllClickListener(Function1<? super java.util.List<C20064gZo>, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnReactiveAllClickListener(Function1<? super java.util.List<C20064gZo>, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:26) call: o.hbQ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C22227hbQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22227hbQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hGQ hgqAEQbTJ = hGQ.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hgqAEQbTJ, "");
        this.KWHzl = hgqAEQbTJ;
        setVisibility(8);
        C25352ivB.setOnDoubleCheckClickListener$default(this, 0L, new Function1() { // from class: o.hbO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22227hbQ.EZpvd(this.copydefault, (android.view.View) obj);
            }
        }, 1, null);
        if (isInEditMode()) {
            hgqAEQbTJ.AEQbTJ.setText(context.getString(C23274hvD.Fragment.toKeyCode));
        }
    }

    public static final Unit EZpvd(C22227hbQ c22227hbQ, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C20069gZt c20069gZt = c22227hbQ.EZpvd;
        if (c20069gZt != null) {
            c22227hbQ.EZpvd(c20069gZt);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull C20069gZt c20069gZt, boolean z) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(c20069gZt, "");
        this.EZpvd = c20069gZt;
        setVisibility(c20069gZt.EZpvd() ^ true ? 8 : 0);
        C52794wYp c52794wYp = this.KWHzl.AEQbTJ;
        if (!c20069gZt.OLrzqt().isEmpty()) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaMetadataCompat1);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.toKeyCode);
        }
        c52794wYp.setText(strAYXKKw);
        if (z) {
            this.KWHzl.AEQbTJ.setOKDSType(260);
            this.KWHzl.AEQbTJ.setOKDSSize(28);
            C52794wYp c52794wYp2 = this.KWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setPaddingRelative(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), c52794wYp2.getPaddingTop(), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), c52794wYp2.getPaddingBottom());
            return;
        }
        this.KWHzl.AEQbTJ.setOKDSType(49);
        this.KWHzl.AEQbTJ.setOKDSSize(36);
        C52794wYp c52794wYp3 = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
        c52794wYp3.setPaddingRelative(0, c52794wYp3.getPaddingTop(), 0, c52794wYp3.getPaddingBottom());
    }

    public final void EZpvd(C20069gZt c20069gZt) {
        if (c20069gZt.OLrzqt().isEmpty()) {
            if (!c20069gZt.AEQbTJ().isEmpty()) {
                trackClick$default(this, "cancel_all", null, 2, null);
                AEQbTJ();
                return;
            }
            return;
        }
        KWHzl();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hbL.updateData$default(o.hbL, java.util.List, java.lang.String, int, java.lang.Object):void */
    public final void EZpvd() {
        final java.util.List<C20064gZo> listOLrzqt;
        C20069gZt c20069gZt = this.EZpvd;
        if (c20069gZt == null || (listOLrzqt = c20069gZt.OLrzqt()) == null) {
            return;
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C22222hbL c22222hbL = new C22222hbL(context, null, 2, 0 == true ? 1 : 0);
        C22222hbL.updateData$default(c22222hbL, listOLrzqt, null, 2, null);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context2);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.getQueueId));
        viewOnClickListenerC54939xaY.EZpvd(c22222hbL);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.QKVWgx), new View.OnClickListener() { // from class: o.hbW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22227hbQ.copydefault(this.copydefault, listOLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.DTwDnp), new View.OnClickListener() { // from class: o.hbX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22227hbQ.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ() {
        final java.util.List<C20064gZo> listAEQbTJ;
        C20069gZt c20069gZt = this.EZpvd;
        if (c20069gZt == null || (listAEQbTJ = c20069gZt.AEQbTJ()) == null) {
            return;
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C22222hbL c22222hbL = new C22222hbL(context, null, 2, 0 == true ? 1 : 0);
        c22222hbL.AEQbTJ(listAEQbTJ, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBaseMediaSessionStub));
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context2);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBaseCommand));
        viewOnClickListenerC54939xaY.EZpvd(c22222hbL);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.QKVWgx), new View.OnClickListener() { // from class: o.hbR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22227hbQ.OLrzqt(this.copydefault, listAEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.DTwDnp), new View.OnClickListener() { // from class: o.hbU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22227hbQ.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl() {
        trackClick$default(this, "order_manage", null, 2, null);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C22221hbK c22221hbK = new C22221hbK(context, null, 2, null);
        final android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(c22221hbK, -2, -2);
        c22221hbK.setOnCancelAllClickListener(new View.OnClickListener() { // from class: o.hbV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22227hbQ.copydefault(popupWindow, this, view);
            }
        });
        c22221hbK.setOnReactiveAllClickListener(new View.OnClickListener() { // from class: o.hbT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22227hbQ.OLrzqt(popupWindow, this, view);
            }
        });
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.showAsDropDown(this.KWHzl.AEQbTJ, 0, C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public static final void copydefault(android.widget.PopupWindow popupWindow, C22227hbQ c22227hbQ, android.view.View view) {
        popupWindow.dismiss();
        trackClick$default(c22227hbQ, "cancel_all", null, 2, null);
        c22227hbQ.AEQbTJ();
    }

    public static final void OLrzqt(android.widget.PopupWindow popupWindow, C22227hbQ c22227hbQ, android.view.View view) {
        popupWindow.dismiss();
        trackClick$default(c22227hbQ, "resume_all", null, 2, null);
        c22227hbQ.EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hbQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackClick$default(C22227hbQ c22227hbQ, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        c22227hbQ.KWHzl(str, map);
    }

    public final void KWHzl(final java.lang.String str, final java.util.Map<java.lang.String, java.lang.String> map) {
        C20069gZt c20069gZt = this.EZpvd;
        if (c20069gZt != null && c20069gZt.copydefault()) {
            C32866mlf.onEvent$default("DEXTrade_Openorder_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.hbP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22227hbQ.KWHzl(this.OLrzqt, str, map, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.hbS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22227hbQ.AEQbTJ(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl(C22227hbQ c22227hbQ, java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        C19818gQl c19818gQlKWHzl;
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl;
        C19818gQl c19818gQlKWHzl2;
        C19818gQl c19818gQlKWHzl3;
        C19818gQl c19818gQlKWHzl4;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C20069gZt c20069gZt = c22227hbQ.EZpvd;
        java.lang.String strCopydefault = null;
        java.lang.String strAEQbTJ = (c20069gZt == null || (c19818gQlKWHzl4 = c20069gZt.KWHzl()) == null) ? null : c19818gQlKWHzl4.AEQbTJ();
        EventParamsList.put$default(eventParamsList, "business_type", strAEQbTJ == null ? "" : strAEQbTJ, false, 4, null);
        C20069gZt c20069gZt2 = c22227hbQ.EZpvd;
        java.lang.String strEZpvd = (c20069gZt2 == null || (c19818gQlKWHzl3 = c20069gZt2.KWHzl()) == null) ? null : c19818gQlKWHzl3.EZpvd();
        EventParamsList.put$default(eventParamsList, "trade_direction", strEZpvd == null ? "" : strEZpvd, false, 4, null);
        C20069gZt c20069gZt3 = c22227hbQ.EZpvd;
        if (c20069gZt3 != null && (c19818gQlKWHzl2 = c20069gZt3.KWHzl()) != null) {
            strCopydefault = c19818gQlKWHzl2.copydefault();
        }
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, strCopydefault == null ? "" : strCopydefault, false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", "yes", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        C20069gZt c20069gZt4 = c22227hbQ.EZpvd;
        if (c20069gZt4 != null && (c19818gQlKWHzl = c20069gZt4.KWHzl()) != null && (mapKWHzl = c19818gQlKWHzl.KWHzl()) != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry2 : mapKWHzl.entrySet()) {
                EventParamsList.put$default(eventParamsList, entry2.getKey(), entry2.getValue(), false, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", "yes", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "orders_open", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        setVisibility(8);
    }

    public static final void copydefault(C22227hbQ c22227hbQ, java.util.List list, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((C20064gZo) it.next()).djBIcL().getType()));
        }
        pairArr[0] = C56390yDp.OLrzqt("type", CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.OqFWZa(arrayList), ",", null, null, 0, null, null, 62, null));
        pairArr[1] = C56390yDp.OLrzqt("orders", java.lang.String.valueOf(list.size()));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C20064gZo) it2.next()).AEQbTJ());
        }
        pairArr[2] = C56390yDp.OLrzqt("network", CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.OqFWZa(arrayList2), ",", null, null, 0, null, null, 62, null));
        c22227hbQ.KWHzl("resume_all_confirm", C56424yEw.gEmmrt(pairArr));
        Function1<? super java.util.List<C20064gZo>, Unit> function1 = c22227hbQ.AEQbTJ;
        if (function1 != null) {
            function1.invoke(list);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(C22227hbQ c22227hbQ, java.util.List list, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((C20064gZo) it.next()).djBIcL().getType()));
        }
        pairArr[0] = C56390yDp.OLrzqt("type", CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.OqFWZa(arrayList), ",", null, null, 0, null, null, 62, null));
        pairArr[1] = C56390yDp.OLrzqt("orders", java.lang.String.valueOf(list.size()));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C20064gZo) it2.next()).AEQbTJ());
        }
        pairArr[2] = C56390yDp.OLrzqt("network", CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.OqFWZa(arrayList2), ",", null, null, 0, null, null, 62, null));
        c22227hbQ.KWHzl("cancel_all_confirm", C56424yEw.gEmmrt(pairArr));
        Function1<? super java.util.List<C20064gZo>, Unit> function1 = c22227hbQ.OLrzqt;
        if (function1 != null) {
            function1.invoke(list);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }
}
