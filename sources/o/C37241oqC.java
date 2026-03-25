package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.relationlist.helper.RelationBasicInfoDisplayHelper$handleKeywordHighlight$1;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37241oqC {
    public static final C37241oqC AEQbTJ = new C37241oqC();

    private C37241oqC() {
    }

    public final void AEQbTJ(@NotNull C33933nLf c33933nLf, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c33933nLf, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        c33933nLf.OLrzqt.setText(C44157sFk.getDisplayName$default(relationInfo, null, 1, null));
        android.widget.TextView textView = c33933nLf.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView, relationInfo.getOfficialTags(), 0, null, false, false, false, 62, null);
        C37241oqC c37241oqC = AEQbTJ;
        nKW nkw = c33933nLf.EZpvd;
        Intrinsics.checkNotNullExpressionValue(nkw, "");
        c37241oqC.EZpvd(nkw, relationInfo);
    }

    public final void copydefault(@NotNull C33931nLd c33931nLd, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c33931nLd, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        c33931nLd.EZpvd.setText(C44157sFk.getDisplayName$default(relationInfo, null, 1, null));
        android.widget.TextView textView = c33931nLd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView, relationInfo.getOfficialTags(), 0, null, false, false, false, 62, null);
        C37241oqC c37241oqC = AEQbTJ;
        C33932nLe c33932nLe = c33931nLd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c33932nLe, "");
        c37241oqC.AEQbTJ(c33932nLe, relationInfo);
    }

    public final void EZpvd(@NotNull nKW nkw, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(nkw, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        C35893oHp c35893oHp = nkw.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.OLrzqt(c35893oHp, relationInfo);
    }

    public final void AEQbTJ(@NotNull C33932nLe c33932nLe, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c33932nLe, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        C35893oHp c35893oHp = c33932nLe.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.OLrzqt(c35893oHp, relationInfo);
    }

    public final void AEQbTJ(@NotNull C35893oHp c35893oHp, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        C35891oHn.OLrzqt(c35893oHp, relationInfo);
    }

    public static /* synthetic */ void handleKeywordHighlight$default(C37241oqC c37241oqC, RecyclerView.ViewHolder viewHolder, android.widget.TextView textView, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        c37241oqC.OLrzqt(viewHolder, textView, str, str2, z);
    }

    public final void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull android.widget.TextView textView, @NotNull java.lang.String str, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null || str2.length() == 0 || ((z && !C37288oqx.AEQbTJ(str, str2)) || (!z && !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) str2, true)))) {
            textView.setText(str);
        } else {
            C37730ozO.OLrzqt.AEQbTJ(viewHolder, new RelationBasicInfoDisplayHelper$handleKeywordHighlight$1(textView, str, str2, z, null));
        }
    }

    public final void copydefault(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        C37730ozO.OLrzqt.OLrzqt(viewHolder);
    }

    public final void OLrzqt(@NotNull C33933nLf c33933nLf, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c33933nLf, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            android.widget.TextView textView = c33933nLf.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            c33933nLf.djBIcL.setText(str);
            return;
        }
        android.widget.TextView textView2 = c33933nLf.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }

    public final void copydefault(@NotNull C33931nLd c33931nLd, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c33931nLd, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            android.widget.TextView textView = c33931nLd.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            c33931nLd.copydefault.setText(str);
            return;
        }
        android.widget.TextView textView2 = c33931nLd.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }
}
