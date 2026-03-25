package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fMh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17626fMh extends RecyclerView.ViewHolder {
    public final C17000euY copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17626fMh(@NotNull C17000euY c17000euY) {
        super(c17000euY.getRoot());
        Intrinsics.checkNotNullParameter(c17000euY, "");
        this.copydefault = c17000euY;
    }

    public final void OLrzqt(@NotNull C17631fMm c17631fMm) {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2 = "";
        Intrinsics.checkNotNullParameter(c17631fMm, "");
        C57440yiU c57440yiU = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57440yiU, "");
        OLrzqt(c57440yiU, c17631fMm.copydefault());
        if (c17631fMm.copydefault().size() <= 1) {
            C17630fMl c17630fMl = (C17630fMl) CollectionsKt___CollectionsKt.firstOrNull(c17631fMm.copydefault());
            if (c17630fMl != null && (strCopydefault = c17630fMl.copydefault()) != null) {
                strCopydefault2 = strCopydefault;
            }
        } else {
            int i = 0;
            for (java.lang.Object obj : c17631fMm.copydefault()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C17630fMl c17630fMl2 = (C17630fMl) obj;
                if (i == 0) {
                    strCopydefault2 = c17630fMl2.copydefault();
                } else {
                    strCopydefault2 = ((java.lang.Object) strCopydefault2) + this.copydefault.getRoot().getContext().getString(C13754dXa.FragmentManager.QfsBiF) + c17630fMl2.copydefault();
                }
                i++;
            }
        }
        this.copydefault.copydefault.setText(strCopydefault2);
        this.copydefault.EZpvd.setText(c17631fMm.AEQbTJ());
        this.copydefault.KWHzl.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dGrqPl), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + (c17631fMm.KWHzl() + 1)))));
    }

    public final void OLrzqt(C57440yiU c57440yiU, java.util.List<C17630fMl> list) {
        c57440yiU.removeAllViews();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C17630fMl) it.next()).EZpvd());
        }
        for (java.lang.String str : arrayList) {
            ShapeableImageView shapeableImageViewEZpvd = EZpvd(c57440yiU);
            C14725dqq.loadFixSizeBorderImage$default(shapeableImageViewEZpvd, str, C52761wXj.TaskDescription.fERRXa, 0.0f, 24.0f, ContextCompat.getColor(c57440yiU.getContext(), C52761wXj.Activity.RKcVTr), false, 32, null);
            c57440yiU.addView(shapeableImageViewEZpvd);
        }
    }

    public final ShapeableImageView EZpvd(C57440yiU c57440yiU) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(c57440yiU.getContext());
        android.content.Context context = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(24, context);
        android.content.Context context2 = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        shapeableImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iOLrzqt, C55298xhM.OLrzqt(24, context2)));
        shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel.Builder().setAllCornerSizes(new RelativeCornerSize(0.5f)).build());
        return shapeableImageView;
    }
}
