package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.okinc.business.defi.wallet.icloud.binders.CloudBackupEvmAddressItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18340fgZ extends AbstractC14584doH<C18339fgY, AbstractC16681eoX> {
    public C18340fgZ() {
        super(CloudBackupEvmAddressItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull AbstractC16681eoX abstractC16681eoX, @NotNull C18339fgY c18339fgY) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(abstractC16681eoX, "");
        Intrinsics.checkNotNullParameter(c18339fgY, "");
        java.util.Iterator<T> it = c18339fgY.OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C10854bwM) next).AEQbTJ() == 1) {
                    break;
                }
            }
        }
        C10854bwM c10854bwMIsConnected = (C10854bwM) next;
        if (c10854bwMIsConnected == null) {
            c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        }
        android.widget.ImageView imageView = abstractC16681eoX.copydefault;
        Intrinsics.copydefault(imageView);
        C14725dqq.loadFixSizeBorderImage$default(imageView, c10854bwMIsConnected != null ? c10854bwMIsConnected.copydefault() : null, C14726dqr.OLrzqt.OLrzqt(), 0.0f, 32.0f, 0, false, 52, null);
        android.widget.TextView textView = abstractC16681eoX.KWHzl;
        textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaControllerCompatApi24));
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(textView.getContext(), C52761wXj.TaskDescription.gqOnQv);
        if (drawable != null) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context);
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DCUTEIddSDPG));
        }
        textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null));
        textView.setCompoundDrawablesRelative(null, null, drawable, null);
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.fgW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18340fgZ.EZpvd(view);
            }
        });
        abstractC16681eoX.djBIcL.setText(c18339fgY.copydefault());
        C57440yiU c57440yiU = abstractC16681eoX.EZpvd;
        Intrinsics.copydefault(c57440yiU);
        OLrzqt(c57440yiU, c18339fgY.OLrzqt());
        C55251xgS c55251xgS = abstractC16681eoX.OLrzqt;
        int size = c18339fgY.OLrzqt().size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("+ ");
        sb.append(size - 5);
        c55251xgS.setText(sb.toString());
    }

    public static final void EZpvd(android.view.View view) {
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.onPlaybackPositionUpdate);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.parameter, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public final void OLrzqt(C57440yiU c57440yiU, java.util.List<C10854bwM> list) {
        c57440yiU.removeAllViews();
        java.util.ArrayList chainSquareIconList$default = C14726dqr.getChainSquareIconList$default(C14726dqr.OLrzqt, list, 0, 2, null);
        int i = C52761wXj.TaskDescription.aHXSQp;
        java.util.Iterator it = chainSquareIconList$default.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            int iIntValue = ((java.lang.Number) next).intValue();
            ShapeableImageView shapeableImageViewAEQbTJ = AEQbTJ(c57440yiU);
            Glide.KWHzl(c57440yiU).OLrzqt(java.lang.Integer.valueOf(iIntValue)).AEQbTJ(i).KWHzl(i).copydefault(i).EZpvd((android.widget.ImageView) shapeableImageViewAEQbTJ);
            c57440yiU.addView(shapeableImageViewAEQbTJ);
        }
    }

    public final ShapeableImageView AEQbTJ(C57440yiU c57440yiU) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(c57440yiU.getContext());
        android.content.Context context = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(20, context);
        android.content.Context context2 = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        shapeableImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iOLrzqt, C55298xhM.OLrzqt(20, context2)));
        shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel.Builder().build());
        shapeableImageView.setImageTintList(ContextCompat.getColorStateList(shapeableImageView.getContext(), C52761wXj.Activity.UlJrfe));
        return shapeableImageView;
    }
}
