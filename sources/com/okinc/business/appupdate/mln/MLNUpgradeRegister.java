package com.okinc.business.appupdate.mln;

import com.immomo.mls.annotation.LuaClass;
import o.AbstractC7372aib;
import o.C7325ahh;
import o.C8010aue;
import o.InterfaceC7380aij;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public final class MLNUpgradeRegister extends AbstractC7372aib {
    public static final int $stable = 0;

    @Override // o.InterfaceC7378aih
    public Class<?>[] registerConstants() {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        return new C8010aue.AssistContent[0];
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application(OKUpgrade.LuaClassName, OKUpgrade.class)};
    }
}
