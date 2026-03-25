package o;

import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.kline.library.indicator.Expression;

/* JADX INFO: loaded from: classes8.dex */
public class oWM extends AbstractC36262oVg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36262oVg
    public java.lang.String AYXKKw() {
        return InvestButtonAction.ACTION_CALLBACK_CLOSE;
    }

    public oWM(java.lang.String str) {
        super(str);
        OLrzqt(new Expression.Output(InvestButtonAction.ACTION_CALLBACK_CLOSE, new Expression.Dialog(), Expression.Output.Style.LINE_SHADER, 1, 7, 8, AbstractC36302oWt.copydefault(1.0f)));
        valueOf();
    }
}
