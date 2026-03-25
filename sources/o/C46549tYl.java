package o;

import com.okinc.preference.mlnservice.model.UDCurrencyModel;
import com.okinc.preference.mlnservice.singleinstance.PreferenceMlnService;
import o.C7325ahh;
import o.C8010aue;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.tYl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46549tYl extends AbstractC7372aib {
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
        return new C7325ahh.Application[]{new C7325ahh.Application(PreferenceMlnService.LUA_CLASS_NAME, PreferenceMlnService.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        java.lang.String[] strArr = UDCurrencyModel.OLrzqt;
        return new C8010aue.AssistContent[]{C8010aue.copydefault("CurrencyModel", (java.lang.Class<? extends LuaUserdata>) UDCurrencyModel.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))};
    }
}
