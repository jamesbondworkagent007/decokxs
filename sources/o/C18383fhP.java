package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC18392fhY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18383fhP extends AbstractC59533zio<InterfaceC18392fhY.ActionBar, C18391fhX> {
    public final Function1<InterfaceC18392fhY.ActionBar, Unit> EZpvd;
    public final Function1<InterfaceC18392fhY.ActionBar, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fhY$ActionBar, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fhY$ActionBar, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C18383fhP(@NotNull Function1<? super InterfaceC18392fhY.ActionBar, Unit> function1, @NotNull Function1<? super InterfaceC18392fhY.ActionBar, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.KWHzl = function1;
        this.EZpvd = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C18391fhX onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16795eqf c16795eqfKWHzl = C16795eqf.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16795eqfKWHzl, "");
        return new C18391fhX(c16795eqfKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C18391fhX c18391fhX, @NotNull final InterfaceC18392fhY.ActionBar actionBar) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String strDjBIcL;
        java.lang.String strDjBIcL2;
        Intrinsics.checkNotNullParameter(c18391fhX, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        c18391fhX.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fhR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18383fhP.copydefault(actionBar, this, view);
            }
        });
        if (actionBar.EZpvd().copydefault()) {
            c18391fhX.itemView.setBackgroundResource(C13754dXa.Activity.gEmmrt);
            c18391fhX.itemView.setAlpha(0.6f);
            android.widget.TextView textView = c18391fhX.EZpvd().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
        } else {
            c18391fhX.itemView.setBackgroundResource(C13754dXa.Activity.valueOf);
            c18391fhX.itemView.setAlpha(1.0f);
            android.widget.TextView textView2 = c18391fhX.EZpvd().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
        c18391fhX.itemView.setSelected(actionBar.OLrzqt());
        final android.content.Context context = c18391fhX.itemView.getContext();
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.gqOnQv);
        if (drawable != null) {
            Intrinsics.copydefault(context);
            drawable.setBounds(0, 0, C55298xhM.OLrzqt(20, context), C55298xhM.OLrzqt(20, context));
        } else {
            drawable = null;
        }
        android.widget.TextView textView3 = c18391fhX.EZpvd().djBIcL;
        int iAEQbTJ = actionBar.EZpvd().AEQbTJ();
        if (iAEQbTJ == 1) {
            string = context.getString(C13754dXa.FragmentManager.ColorInt);
        } else if (iAEQbTJ == 4) {
            string = context.getString(C13754dXa.FragmentManager.isDrawerIndicatorEnabled);
        } else if (iAEQbTJ == 5) {
            string = context.getString(C13754dXa.FragmentManager.createSocket);
        } else if (iAEQbTJ != 6) {
            string = "";
        } else {
            Intrinsics.copydefault(context);
            int i = C13754dXa.FragmentManager.isEmpty;
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
            pairArr[0] = C56390yDp.OLrzqt("chainName", (c10854bwMCopydefault == null || (strDjBIcL2 = c10854bwMCopydefault.djBIcL()) == null) ? "" : strDjBIcL2);
            string = C33069mpW.KWHzl(context, i, C56424yEw.AYXKKw(pairArr));
        }
        textView3.setText(string);
        c18391fhX.EZpvd().djBIcL.setCompoundDrawablesRelative(null, null, drawable, null);
        c18391fhX.EZpvd().djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.fhQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18383fhP.EZpvd(actionBar, context, view);
            }
        });
        android.widget.TextView textView4 = c18391fhX.EZpvd().EZpvd;
        int iAEQbTJ2 = actionBar.EZpvd().AEQbTJ();
        if (iAEQbTJ2 == 1) {
            string2 = context.getString(C13754dXa.FragmentManager.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda1);
        } else if (iAEQbTJ2 == 4) {
            Intrinsics.copydefault(context);
            string2 = C33069mpW.KWHzl(context, C13754dXa.FragmentManager.getToolbarNavigationClickListener, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(actionBar.EZpvd().OLrzqt().size()))));
        } else if (iAEQbTJ2 == 5) {
            Intrinsics.copydefault(context);
            string2 = C33069mpW.KWHzl(context, C13754dXa.FragmentManager.getSupportedCipherSuites, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(actionBar.EZpvd().OLrzqt().size()))));
        } else if (iAEQbTJ2 != 6) {
            string2 = "";
        } else {
            Intrinsics.copydefault(context);
            int i2 = C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallback;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
            pairArr2[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(actionBar.EZpvd().OLrzqt().size()));
            C10854bwM c10854bwMCopydefault2 = C10954byG.EZpvd.valueOf().copydefault();
            if (c10854bwMCopydefault2 == null || (strDjBIcL = c10854bwMCopydefault2.djBIcL()) == null) {
                strDjBIcL = "";
            }
            pairArr2[1] = C56390yDp.OLrzqt("chainName", strDjBIcL);
            string2 = C33069mpW.KWHzl(context, i2, C56424yEw.AYXKKw(pairArr2));
        }
        textView4.setText(string2);
        C57440yiU c57440yiU = c18391fhX.EZpvd().copydefault;
        Intrinsics.checkNotNullExpressionValue(c57440yiU, "");
        AEQbTJ(c57440yiU, actionBar.EZpvd().OLrzqt());
        C57440yiU c57440yiU2 = c18391fhX.EZpvd().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57440yiU2, "");
        KWHzl(c57440yiU2, actionBar.EZpvd().OLrzqt());
        C57440yiU c57440yiU3 = c18391fhX.EZpvd().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57440yiU3, "");
        c57440yiU3.setVisibility(actionBar.EZpvd().OLrzqt().size() > 2 ? 0 : 8);
        c18391fhX.EZpvd().copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.fhS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18383fhP.OLrzqt(this.OLrzqt, actionBar, view);
            }
        });
        c18391fhX.EZpvd().OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.fhV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18383fhP.copydefault(this.OLrzqt, actionBar, view);
            }
        });
    }

    public static final void copydefault(InterfaceC18392fhY.ActionBar actionBar, C18383fhP c18383fhP, android.view.View view) {
        if (actionBar.EZpvd().copydefault()) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C19605gIo.toastWithFailedIcon$default(context, C13754dXa.FragmentManager.ColorLong, 0, 2, (java.lang.Object) null);
            return;
        }
        c18383fhP.KWHzl.invoke(actionBar);
    }

    public static final void EZpvd(InterfaceC18392fhY.ActionBar actionBar, android.content.Context context, android.view.View view) {
        java.lang.String strDjBIcL;
        android.content.Context context2 = view.getContext();
        java.lang.String string = "";
        Intrinsics.checkNotNullExpressionValue(context2, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context2);
        int iAEQbTJ = actionBar.EZpvd().AEQbTJ();
        if (iAEQbTJ == 1) {
            string = context.getString(C13754dXa.FragmentManager.toLegacyStreamType);
        } else if (iAEQbTJ == 4) {
            string = context.getString(C13754dXa.FragmentManager.onDrawerClosed);
        } else if (iAEQbTJ == 5) {
            string = context.getString(C13754dXa.FragmentManager.STbtMW);
        } else if (iAEQbTJ == 6) {
            Intrinsics.copydefault(context);
            int i = C13754dXa.FragmentManager.applyOptions;
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
            if (c10854bwMCopydefault != null && (strDjBIcL = c10854bwMCopydefault.djBIcL()) != null) {
                string = strDjBIcL;
            }
            pairArr[0] = C56390yDp.OLrzqt("chainName", string);
            string = C33069mpW.KWHzl(context, i, C56424yEw.AYXKKw(pairArr));
        }
        viewOnClickListenerC54939xaY.EZpvd(string);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.parameter, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(C18383fhP c18383fhP, InterfaceC18392fhY.ActionBar actionBar, android.view.View view) {
        c18383fhP.EZpvd.invoke(actionBar);
    }

    public static final void copydefault(C18383fhP c18383fhP, InterfaceC18392fhY.ActionBar actionBar, android.view.View view) {
        c18383fhP.EZpvd.invoke(actionBar);
    }

    private final void AEQbTJ(C57440yiU c57440yiU, java.util.List<C10854bwM> list) {
        c57440yiU.removeAllViews();
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 2);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(C18388fhU.AEQbTJ((C10854bwM) it.next()));
        }
        for (java.lang.String str : arrayList) {
            ShapeableImageView shapeableImageViewKWHzl = KWHzl(c57440yiU);
            C14725dqq.loadFixSizeBorderImage$default(shapeableImageViewKWHzl, str, C13754dXa.Activity.aKErDB, 1.0f, 32.0f, ContextCompat.getColor(c57440yiU.getContext(), C52761wXj.Activity.RKcVTr), false, 32, null);
            c57440yiU.addView(shapeableImageViewKWHzl);
        }
    }

    public final void KWHzl(C57440yiU c57440yiU, java.util.List<C10854bwM> list) {
        c57440yiU.removeAllViews();
        if (list.size() <= 2) {
            return;
        }
        C10854bwM c10854bwM = list.get(2);
        ShapeableImageView shapeableImageViewKWHzl = KWHzl(c57440yiU);
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageViewKWHzl, C18388fhU.AEQbTJ(c10854bwM), C13754dXa.Activity.aKErDB, 1.0f, 32.0f, ContextCompat.getColor(c57440yiU.getContext(), C52761wXj.Activity.RKcVTr), false, 32, null);
        c57440yiU.addView(shapeableImageViewKWHzl);
        if (list.size() <= 3) {
            return;
        }
        ShapeableImageView shapeableImageViewKWHzl2 = KWHzl(c57440yiU);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c57440yiU.getContext(), C52761wXj.TaskDescription.HJWChPOZOJIj);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(c57440yiU.getContext(), C52761wXj.Activity.iOIMNp));
            shapeableImageViewKWHzl2.setImageDrawable(drawable);
        }
        shapeableImageViewKWHzl2.setScaleType(ImageView.ScaleType.CENTER);
        shapeableImageViewKWHzl2.setBackgroundResource(C52761wXj.Activity.registerUser);
        android.content.Context context = c57440yiU.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        shapeableImageViewKWHzl2.setStrokeWidth(C55298xhM.AEQbTJ(1, context));
        shapeableImageViewKWHzl2.setStrokeColorResource(C52761wXj.Activity.RKcVTr);
        c57440yiU.addView(shapeableImageViewKWHzl2);
    }

    private final ShapeableImageView KWHzl(C57440yiU c57440yiU) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(c57440yiU.getContext());
        android.content.Context context = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(32, context);
        android.content.Context context2 = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        shapeableImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iOLrzqt, C55298xhM.OLrzqt(32, context2)));
        shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel.Builder().setAllCornerSizes(new RelativeCornerSize(0.5f)).build());
        return shapeableImageView;
    }
}
