package o;

import com.okinc.business.invest_biz.data.bean.InvestPopUpData;

/* JADX INFO: renamed from: o.art, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7867art {
    public static java.lang.String AEQbTJ(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((i & 48) == 48) {
            sb.append("TOP");
            sb.append(' ');
        }
        if ((i & 80) == 80) {
            sb.append(InvestPopUpData.POSITION_BOTTOM);
            sb.append(' ');
        }
        if ((i & 8388611) == 8388611) {
            sb.append("LEFT");
            sb.append(' ');
        }
        if ((i & 8388613) == 8388613) {
            sb.append("RIGHT");
            sb.append(' ');
        }
        if ((i & 17) == 17) {
            sb.append("CENTER");
            sb.append(' ');
        } else {
            if ((i & 16) == 16) {
                sb.append("CENTER_VERTICAL");
                sb.append(' ');
            }
            if ((i & 1) == 1) {
                sb.append("CENTER_HORIZONTAL");
                sb.append(' ');
            }
        }
        if (sb.length() == 0) {
            sb.append("NO GRAVITY");
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
