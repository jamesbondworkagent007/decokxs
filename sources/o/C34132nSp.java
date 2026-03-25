package o;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nSp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34132nSp {
    public static final C34132nSp KWHzl = new C34132nSp();

    private C34132nSp() {
    }

    public final void OLrzqt(@NotNull C33933nLf c33933nLf, @NotNull GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(c33933nLf, "");
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        c33933nLf.OLrzqt.setText(C44157sFk.EZpvd(groupMemberInfo));
        android.widget.TextView textView = c33933nLf.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView, groupMemberInfo.getOfficialTags(), 0, null, false, false, false, 62, null);
        C35893oHp c35893oHp = c33933nLf.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.KWHzl(c35893oHp, groupMemberInfo);
        android.widget.TextView textView2 = c33933nLf.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C37683oyU.AEQbTJ(textView2, groupMemberInfo.getRole());
    }
}
