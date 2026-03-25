package o;

import com.okinc.share.mln.OKShareBridge;
import com.okinc.share.mln.OKShareCustomParamsTransform;
import com.okinc.share.mln.OKShareEditor;
import com.okinc.share.mln.OKShareFooterView;
import o.C7325ahh;
import o.C8010aue;

/* JADX INFO: renamed from: o.uhF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49047uhF extends AbstractC43215rlA implements InterfaceC7377aig {
    @Override // o.InterfaceC7378aih
    public java.lang.Class<?>[] registerConstants() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.TaskDescription[] registerConverter() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public InterfaceC7380aij registerRouter() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.LoaderManager[] registerStaticClass() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application("OKShare", OKShareBridge.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        return new C8010aue.AssistContent[]{new C8010aue.AssistContent("OKShareFooterView", OKShareFooterView.class, false, OKShareFooterView.EZpvd), new C8010aue.AssistContent("OKShareEditor", OKShareEditor.class, false, OKShareEditor.copydefault), new C8010aue.AssistContent("OKShareCustomParamsTransform", OKShareCustomParamsTransform.class, false, OKShareCustomParamsTransform.copydefault)};
    }
}
