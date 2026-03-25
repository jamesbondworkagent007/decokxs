package o;

import com.okinc.okimcore.model.remote.OfficialTagInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class tGZ {
    public static /* synthetic */ void updateTagViewWithTagInfo$default(android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        OLrzqt(textView, officialTagInfo, i);
    }

    public static final void OLrzqt(android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i) {
        InterfaceC35179nqT interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class);
        if (interfaceC35179nqT != null) {
            interfaceC35179nqT.copydefault(textView, officialTagInfo, i);
        } else {
            textView.setText((java.lang.CharSequence) null);
            textView.setVisibility(i);
        }
    }
}
