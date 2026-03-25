package o;

import com.okinc.business.defi.wallet.mine.search.data.model.TagMeta;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;

/* JADX INFO: renamed from: o.fsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18993fsr {
    public static /* synthetic */ C18985fsj fromTagWrapper$default(TagWrapper tagWrapper, boolean z, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            context = null;
        }
        return KWHzl(tagWrapper, z, context);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fsJ.getTextColor$default(o.fsJ, com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper, boolean, boolean, java.lang.Integer, int, java.lang.Object):int */
    public static final C18985fsj KWHzl(TagWrapper tagWrapper, boolean z, android.content.Context context) {
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        if (tagMetaAEQbTJ == null) {
            return null;
        }
        boolean z2 = C33512mxp.AEQbTJ.AYXKKw() == 0;
        boolean z3 = context != null && C33054mpH.AEQbTJ(context);
        C18959fsJ c18959fsJ = C18959fsJ.OLrzqt;
        java.lang.String strEZpvd = c18959fsJ.EZpvd(tagMetaAEQbTJ, z2, z3);
        if (!z) {
            return new C18985fsj(tagWrapper.KWHzl(), strEZpvd, tagWrapper.AEQbTJ().isConnected(), null, new android.text.SpannedString(""), false, null, null, 200, null);
        }
        int textColor$default = C18959fsJ.getTextColor$default(c18959fsJ, tagWrapper, z2, z3, null, 8, null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) tagMetaAEQbTJ.AhwBna());
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(textColor$default), 0, tagMetaAEQbTJ.AhwBna().length(), 33);
        return new C18985fsj(tagWrapper.KWHzl(), strEZpvd, tagWrapper.AEQbTJ().isConnected(), null, new android.text.SpannedString(spannableStringBuilder), false, null, tagWrapper.AEQbTJ().AEQbTJ(), 104, null);
    }
}
