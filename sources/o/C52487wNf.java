package o;

import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.google.android.flexbox.FlexboxLayout;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52487wNf extends AbstractC59533zio<TacticsInsideItemData, C52488wNg> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C52488wNg onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C48648uZe c48648uZeOLrzqt = C48648uZe.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c48648uZeOLrzqt, "");
        return new C52488wNg(c48648uZeOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52488wNg c52488wNg, @NotNull TacticsInsideItemData tacticsInsideItemData) {
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl2;
        C55312xha c55312xhaValueOf3;
        C55320xhi c55320xhiKWHzl3;
        C55320xhi c55320xhiKWHzl4;
        C55320xhi c55320xhiKWHzl5;
        Intrinsics.checkNotNullParameter(c52488wNg, "");
        Intrinsics.checkNotNullParameter(tacticsInsideItemData, "");
        C55312xha c55312xhaValueOf4 = c52488wNg.copydefault().gEmmrt.valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl5 = c55312xhaValueOf4.KWHzl()) != null) {
            c55320xhiKWHzl5.setText(tacticsInsideItemData.getTitle());
        }
        C55312xha c55312xhaValueOf5 = c52488wNg.copydefault().AEQbTJ.valueOf();
        if (c55312xhaValueOf5 != null && (c55320xhiKWHzl4 = c55312xhaValueOf5.KWHzl()) != null) {
            c55320xhiKWHzl4.setText(tacticsInsideItemData.getText());
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(tacticsInsideItemData.getTextStyle()), 0) && (c55312xhaValueOf3 = c52488wNg.copydefault().AEQbTJ.valueOf()) != null && (c55320xhiKWHzl3 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl3.setTextAppearance(tacticsInsideItemData.getTextStyle());
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(tacticsInsideItemData.getTvColor()), 0) && (c55312xhaValueOf2 = c52488wNg.copydefault().gEmmrt.valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextColor(tacticsInsideItemData.getTvColor());
        }
        if (C33129mqd.AhwBna(tacticsInsideItemData.getRightTextColor(), 0) && (c55312xhaValueOf = c52488wNg.copydefault().AEQbTJ.valueOf()) != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            java.lang.Integer rightTextColor = tacticsInsideItemData.getRightTextColor();
            c55320xhiKWHzl.setTextColor(rightTextColor != null ? rightTextColor.intValue() : 0);
        }
        FlexboxLayout flexboxLayout = c52488wNg.copydefault().OLrzqt;
        Intrinsics.copydefault(flexboxLayout);
        flexboxLayout.setVisibility(tacticsInsideItemData.getTags().isEmpty() ^ true ? 0 : 8);
        if (!tacticsInsideItemData.getTags().isEmpty()) {
            flexboxLayout.removeAllViews();
            for (TacticsListLabelUiData tacticsListLabelUiData : tacticsInsideItemData.getTags()) {
                C52534wOz c52534wOz = C52534wOz.KWHzl;
                android.content.Context context = c52488wNg.copydefault().getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C55251xgS c55251xgSCopydefault = c52534wOz.copydefault(context, tacticsListLabelUiData);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMarginStart(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                Unit unit = Unit.INSTANCE;
                flexboxLayout.addView(c55251xgSCopydefault, marginLayoutParams);
            }
        } else {
            flexboxLayout.removeAllViews();
        }
        if (c52488wNg.copydefault().OLrzqt.getFlexLines().size() > 1) {
            c52488wNg.copydefault().EZpvd.setMaxElementsWrap(1);
        } else {
            c52488wNg.copydefault().EZpvd.setMaxElementsWrap(-1);
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tacticsInsideItemData.getRightImageUrl())) {
            C49858uwV c49858uwV = c52488wNg.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(c49858uwV, "");
            c49858uwV.setVisibility(0);
            C48648uZe c48648uZeCopydefault = c52488wNg.copydefault();
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(c48648uZeCopydefault.getRoot().getContext());
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, tacticsInsideItemData.getRightImageUrl(), "lfit", 20, 20).djBIcL().KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd((android.widget.ImageView) c48648uZeCopydefault.copydefault);
            return;
        }
        C49858uwV c49858uwV2 = c52488wNg.copydefault().copydefault;
        Intrinsics.checkNotNullExpressionValue(c49858uwV2, "");
        c49858uwV2.setVisibility(8);
    }
}
