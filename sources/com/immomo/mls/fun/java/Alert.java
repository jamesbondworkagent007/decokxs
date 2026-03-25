package com.immomo.mls.fun.java;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.immomo.mls.annotation.BridgeType;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.List;
import o.C7322ahe;
import o.C7343ahz;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class Alert {
    public InterfaceC7835arN AEQbTJ;
    public Globals AYXKKw;
    public Context AhwBna;
    public String AkhnZx;
    public byte DbNXlk;
    public String EZpvd;
    public String KWHzl;
    public InterfaceC7835arN OLrzqt;
    public List copydefault;
    public AlertDialog djBIcL;
    public String fARcdN;
    public InterfaceC7835arN fetchVPNInfo;
    public String gEmmrt;
    public String isConnected;
    public String valueOf;
    public InterfaceC7835arN values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "message", type = BridgeType.GETTER)
    public String getMessage() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "title", type = BridgeType.GETTER)
    public String getTitle() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "message", type = BridgeType.SETTER)
    public void setMessage(String str) {
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "title", type = BridgeType.SETTER)
    public void setTitle(String str) {
        this.fARcdN = str;
    }

    public Alert(Globals globals, LuaValue[] luaValueArr) {
        this.AYXKKw = globals;
    }

    @LuaBridge
    public void setCancel(String str, InterfaceC7835arN interfaceC7835arN) {
        this.DbNXlk = (byte) (this.DbNXlk | 2);
        this.gEmmrt = str;
        this.OLrzqt = interfaceC7835arN;
        EZpvd();
    }

    @LuaBridge
    public void setOk(String str, InterfaceC7835arN interfaceC7835arN) {
        this.DbNXlk = (byte) (this.DbNXlk | 2);
        this.AkhnZx = str;
        this.values = interfaceC7835arN;
        EZpvd();
    }

    @LuaBridge
    public void setButtonList(List list, InterfaceC7835arN interfaceC7835arN) {
        this.DbNXlk = (byte) (this.DbNXlk | 4);
        this.copydefault = list;
        this.AEQbTJ = interfaceC7835arN;
        EZpvd();
    }

    @LuaBridge
    public void setSingleButton(String str, InterfaceC7835arN interfaceC7835arN) {
        this.DbNXlk = (byte) (this.DbNXlk | 1);
        this.fetchVPNInfo = interfaceC7835arN;
        this.isConnected = str;
        EZpvd();
    }

    @LuaBridge
    public void show() {
        Context context = this.AhwBna;
        if (context == null) {
            C7322ahe c7322ahe = (C7322ahe) this.AYXKKw.AuCTel();
            context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        }
        Context context2 = context;
        if (context2 == null) {
            return;
        }
        byte b = this.DbNXlk;
        if (b == 1) {
            KWHzl(context2, copydefault(), this.fARcdN, this.valueOf, this.fetchVPNInfo);
        } else if (b == 2) {
            AEQbTJ(context2, AEQbTJ(), KWHzl(), this.fARcdN, this.valueOf, this.values, this.OLrzqt);
        } else {
            if (b != 4) {
                return;
            }
            KWHzl(context2, this.copydefault, this.fARcdN, this.valueOf, this.AEQbTJ);
        }
    }

    @LuaBridge
    public void dismiss() {
        AlertDialog alertDialog = this.djBIcL;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void KWHzl(Context context, String str, String str2, String str3, final InterfaceC7835arN interfaceC7835arN) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setCancelable(false).setTitle(str2).setMessage(str3).setPositiveButton(str, new DialogInterface.OnClickListener() { // from class: com.immomo.mls.fun.java.Alert.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                InterfaceC7835arN interfaceC7835arN2 = interfaceC7835arN;
                if (interfaceC7835arN2 != null) {
                    interfaceC7835arN2.EZpvd(new Object[0]);
                }
                dialogInterface.dismiss();
            }
        }).create();
        this.djBIcL = alertDialogCreate;
        alertDialogCreate.show();
    }

    public void AEQbTJ(Context context, String str, String str2, String str3, String str4, final InterfaceC7835arN interfaceC7835arN, final InterfaceC7835arN interfaceC7835arN2) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setCancelable(false).setTitle(str3).setMessage(str4).setPositiveButton(str, new DialogInterface.OnClickListener() { // from class: com.immomo.mls.fun.java.Alert.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                InterfaceC7835arN interfaceC7835arN3 = interfaceC7835arN;
                if (interfaceC7835arN3 != null) {
                    interfaceC7835arN3.EZpvd(new Object[0]);
                }
                dialogInterface.dismiss();
            }
        }).setNegativeButton(str2, new DialogInterface.OnClickListener() { // from class: com.immomo.mls.fun.java.Alert.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                InterfaceC7835arN interfaceC7835arN3 = interfaceC7835arN2;
                if (interfaceC7835arN3 != null) {
                    interfaceC7835arN3.EZpvd(new Object[0]);
                }
                dialogInterface.dismiss();
            }
        }).create();
        this.djBIcL = alertDialogCreate;
        alertDialogCreate.show();
    }

    public void KWHzl(Context context, List list, String str, String str2, final InterfaceC7835arN interfaceC7835arN) {
        this.djBIcL = new AlertDialog.Builder(context).setCancelable(false).setTitle(str).setMessage(str2).create();
        ListView listView = new ListView(context);
        this.djBIcL.setView(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.immomo.mls.fun.java.Alert.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                InterfaceC7835arN interfaceC7835arN2 = interfaceC7835arN;
                if (interfaceC7835arN2 != null) {
                    interfaceC7835arN2.EZpvd(Integer.valueOf(i + 1));
                }
                Alert.this.djBIcL.dismiss();
            }
        });
        listView.setAdapter((ListAdapter) new ArrayAdapter(context, C7343ahz.Activity.getFieldNames, list));
        this.djBIcL.show();
    }

    public String copydefault() {
        return copydefault(this.isConnected) ? this.isConnected : this.KWHzl;
    }

    public String AEQbTJ() {
        return copydefault(this.AkhnZx) ? this.AkhnZx : this.KWHzl;
    }

    public String KWHzl() {
        return copydefault(this.gEmmrt) ? this.gEmmrt : this.EZpvd;
    }

    public void EZpvd() {
        byte b = this.DbNXlk;
        if (b != 1 && b != 2 && b != 4) {
            throw new IllegalArgumentException("cannot set ok(cancel) text and button list on same instance!");
        }
    }

    public static boolean copydefault(String str) {
        return str != null && str.length() > 0;
    }
}
