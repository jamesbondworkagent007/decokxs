package o;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.kline.library.indicator.Expression;

/* JADX INFO: renamed from: o.oVu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36276oVu extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return InvestButtonAction.ACTION_CALLBACK_CLOSE;
    }

    public C36276oVu(java.lang.String str) {
        super(str);
        Expression.Context context = new Expression.Context();
        Expression.Output.Style style = Expression.Output.Style.NONE;
        OLrzqt(new Expression.Output(VerifyDAppDomainUrlResponse.LEVEL_HIGH, context, style, 0));
        OLrzqt(new Expression.Output(VerifyDAppDomainUrlResponse.LEVEL_LOW, new Expression.ApplicationInfo(), style, 0));
        OLrzqt(new Expression.Output(InvestButtonAction.ACTION_CALLBACK_CLOSE, new Expression.Dialog(), Expression.Output.Style.LINE, 1));
        valueOf();
    }
}
