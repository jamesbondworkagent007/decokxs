package com.okinc.referral.mlnservice.view;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.recycler.UDCollectionLayout;
import o.C33570myu;
import o.C48740ubQ;
import o.C7347aiC;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public class UDGalleryLayout extends UDCollectionLayout {
    public static final String[] LUA_CLASS_NAME = {"OKGrowthReferralCollectionViewLayout"};
    public int cellWidth;
    public int spacingWidth;
    public UDView view;

    @InterfaceC60044zuT
    public UDGalleryLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        if (luaValueArr.length > 0) {
            this.cellWidth = luaValueArr[0].toInt();
        }
        if (luaValueArr.length > 1) {
            this.spacingWidth = luaValueArr[1].toInt();
        }
        if (luaValueArr.length > 2 && luaValueArr[2].isUserdata() && (luaValueArr[2].toUserdata() instanceof UDView)) {
            this.view = (UDView) luaValueArr[2].toUserdata();
        }
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionLayout
    public C7347aiC values() {
        UDView uDView = this.view;
        Context contextAubY = uDView != null ? uDView.AubY() : null;
        int i = this.spacingWidth;
        if (i != 0) {
            return new C48740ubQ(C7865arr.copydefault(i), (C33570myu.AEQbTJ() - C7865arr.copydefault(this.cellWidth)) / 2, this, contextAubY);
        }
        return new C48740ubQ((C33570myu.AEQbTJ() - C7865arr.copydefault(this.cellWidth * 2)) / 4, (C33570myu.AEQbTJ() - C7865arr.copydefault(this.cellWidth)) / 2, this, contextAubY);
    }
}
