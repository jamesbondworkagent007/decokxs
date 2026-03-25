package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.android.flexbox.FlexboxLayout;
import com.okinc.im.view.MessageReaction;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.oHg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35884oHg extends android.widget.LinearLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final C44113sDv AEQbTJ;
    public Function1<? super MessageReaction, Unit> KWHzl;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35884oHg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35884oHg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ(boolean z) {
        return z ? C52761wXj.Activity.zblBkD : C52761wXj.Activity.fdOvFl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnReactionClickListener(Function1<? super MessageReaction, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnShowAllReactionsClickListener(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.oHg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35884oHg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35884oHg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C44113sDv c44113sDvCopydefault = C44113sDv.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c44113sDvCopydefault, "");
        this.AEQbTJ = c44113sDvCopydefault;
        setOrientation(1);
    }

    /* JADX INFO: renamed from: o.oHg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oHg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final void OLrzqt(boolean z) {
        setGravity(z ? 8388611 : 8388613);
        FlexboxLayout flexboxLayout = this.AEQbTJ.AEQbTJ;
        int i = !z ? 1 : 0;
        flexboxLayout.setJustifyContent(i);
        this.AEQbTJ.AEQbTJ.setAlignContent(i);
    }

    public final void setReactionView(C44106sDo c44106sDo, OKConversationType oKConversationType, final MessageReaction messageReaction, OKConversation oKConversation, com.okinc.okimcore.model.remote.UserInfo userInfo, boolean z) {
        ConstraintLayout root = c44106sDo.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(0);
        c44106sDo.OLrzqt.setText(messageReaction.getEmoji());
        android.widget.TextView textView = c44106sDo.copydefault;
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), AEQbTJ(z)));
        android.widget.TextView textView2 = c44106sDo.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility((messageReaction.getCount() <= 1 || C35712oAx.KWHzl(oKConversationType)) ? 8 : 0);
        int iDp2px$default = (!C35712oAx.KWHzl(oKConversationType) && messageReaction.getCount() <= 1) ? C55298xhM.dp2px$default(4.0f, null, 1, null) : 0;
        android.widget.TextView textView3 = c44106sDo.OLrzqt;
        textView3.setPaddingRelative(textView3.getPaddingStart(), c44106sDo.OLrzqt.getPaddingTop(), iDp2px$default, c44106sDo.OLrzqt.getPaddingBottom());
        c44106sDo.copydefault.setText(pTB.formatICUCompact$default(java.lang.Integer.valueOf(messageReaction.getCount()), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null));
        setupAvatars(c44106sDo, oKConversationType, messageReaction, oKConversation, userInfo);
        android.view.View view = c44106sDo.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        setBackground(view, messageReaction.isUserReacted(), z);
        c44106sDo.getRoot().setOnClickListener(this.KWHzl != null ? new View.OnClickListener() { // from class: o.oHf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C35884oHg.setReactionView$lambda$2(this.EZpvd, messageReaction, view2);
            }
        } : null);
        c44106sDo.getRoot().setOnLongClickListener(this.copydefault != null ? new View.OnLongClickListener() { // from class: o.oHc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view2) {
                return C35884oHg.AEQbTJ(this.KWHzl, view2);
            }
        } : null);
    }

    public static final void setReactionView$lambda$2(C35884oHg c35884oHg, MessageReaction messageReaction, android.view.View view) {
        Function1<? super MessageReaction, Unit> function1 = c35884oHg.KWHzl;
        if (function1 != null) {
            function1.invoke(messageReaction);
        }
    }

    public static final boolean AEQbTJ(C35884oHg c35884oHg, android.view.View view) {
        Function0<Unit> function0 = c35884oHg.copydefault;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    public final void setupAvatars(C44106sDo c44106sDo, OKConversationType oKConversationType, MessageReaction messageReaction, OKConversation oKConversation, com.okinc.okimcore.model.remote.UserInfo userInfo) {
        InterfaceC35180nqU interfaceC35180nqU;
        InterfaceC35180nqU interfaceC35180nqU2;
        InterfaceC35180nqU interfaceC35180nqU3;
        InterfaceC35180nqU interfaceC35180nqU4;
        if (oKConversationType != OKConversationType.PRIVATE) {
            ConstraintLayout constraintLayout = c44106sDo.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout2 = c44106sDo.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(0);
        boolean z = messageReaction.getCount() == 1;
        C35893oHp c35893oHp = c44106sDo.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        c35893oHp.setVisibility(0);
        C35893oHp c35893oHp2 = c44106sDo.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
        c35893oHp2.setVisibility(z ^ true ? 0 : 8);
        if (!z) {
            if (userInfo != null && (interfaceC35180nqU2 = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) != null) {
                C35893oHp c35893oHp3 = c44106sDo.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c35893oHp3, "");
                interfaceC35180nqU2.copydefault(c35893oHp3, userInfo);
            }
            if (oKConversation == null || (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
                return;
            }
            C35893oHp c35893oHp4 = c44106sDo.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c35893oHp4, "");
            interfaceC35180nqU.AEQbTJ(c35893oHp4, oKConversation);
            return;
        }
        if (messageReaction.isUserReacted()) {
            if (userInfo == null || (interfaceC35180nqU4 = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
                return;
            }
            C35893oHp c35893oHp5 = c44106sDo.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c35893oHp5, "");
            interfaceC35180nqU4.copydefault(c35893oHp5, userInfo);
            return;
        }
        if (oKConversation == null || (interfaceC35180nqU3 = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
            return;
        }
        C35893oHp c35893oHp6 = c44106sDo.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c35893oHp6, "");
        interfaceC35180nqU3.AEQbTJ(c35893oHp6, oKConversation);
    }

    public final void setMoreReactionsButton(sDG sdg, int i, boolean z, boolean z2) {
        ConstraintLayout root = sdg.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(0);
        java.lang.String iCUCompact$default = pTB.formatICUCompact$default(java.lang.Integer.valueOf(i), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null);
        android.view.View view = sdg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        setBackground(view, z2, z);
        sdg.KWHzl.setText(Marker.ANY_NON_NULL_MARKER + iCUCompact$default);
        android.widget.TextView textView = sdg.KWHzl;
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), AEQbTJ(z)));
        sdg.getRoot().setOnClickListener(this.copydefault != null ? new View.OnClickListener() { // from class: o.oHd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C35884oHg.setMoreReactionsButton$lambda$8(this.copydefault, view2);
            }
        } : null);
    }

    public static final void setMoreReactionsButton$lambda$8(C35884oHg c35884oHg, android.view.View view) {
        Function0<Unit> function0 = c35884oHg.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setBackground(android.view.View view, boolean z, boolean z2) {
        view.setBackgroundResource(z ? C44105sDn.Application.copydefault : z2 ? C44105sDn.Application.AEQbTJ : C44105sDn.Application.OLrzqt);
    }

    public final void setReactions(OKConversationType oKConversationType, @NotNull java.util.List<ReactionDisplay> list, OKConversation oKConversation, com.okinc.okimcore.model.remote.UserInfo userInfo, boolean z, boolean z2) {
        boolean z3;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ReactionDisplay reactionDisplay : list) {
            arrayList.add(new MessageReaction(reactionDisplay.getEmoji(), reactionDisplay.getCount(), reactionDisplay.isCurrentUserReaction()));
        }
        OLrzqt(z);
        if (arrayList.isEmpty()) {
            FlexboxLayout flexboxLayout = this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(flexboxLayout, "");
            flexboxLayout.setVisibility(8);
            return;
        }
        FlexboxLayout flexboxLayout2 = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(flexboxLayout2, "");
        flexboxLayout2.setVisibility(0);
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 3);
        int size = arrayList.size() - listAhwBna.size();
        C44113sDv c44113sDv = this.AEQbTJ;
        java.util.List listGEmmrt = yDY.gEmmrt(c44113sDv.copydefault, c44113sDv.OLrzqt, c44113sDv.KWHzl);
        int i = 0;
        for (int size2 = listAhwBna.size(); i < size2; size2 = size2) {
            java.lang.Object obj = listGEmmrt.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            setReactionView((C44106sDo) obj, oKConversationType, (MessageReaction) listAhwBna.get(i), oKConversation, userInfo, z2);
            i++;
            listGEmmrt = listGEmmrt;
        }
        java.util.List list2 = listGEmmrt;
        for (int size3 = listAhwBna.size(); size3 < 3; size3++) {
            ConstraintLayout root = ((C44106sDo) list2.get(size3)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(8);
        }
        if (size > 0) {
            java.util.List listSubList = arrayList.subList(listAhwBna.size(), arrayList.size());
            if ((listSubList instanceof java.util.Collection) && listSubList.isEmpty()) {
                z3 = false;
            } else {
                java.util.Iterator it = listSubList.iterator();
                while (it.hasNext()) {
                    if (((MessageReaction) it.next()).isUserReacted()) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
            sDG sdg = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(sdg, "");
            setMoreReactionsButton(sdg, size, z2, z3);
            return;
        }
        ConstraintLayout root2 = this.AEQbTJ.EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.setVisibility(8);
    }
}
