package o;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.HttpException;
import java.util.Map;
import o.NU;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public class ND implements NU<java.io.InputStream>, okhttp3.Callback {
    public ResponseBody AEQbTJ;
    public final Call.Factory EZpvd;
    public java.io.InputStream KWHzl;
    public volatile Call OLrzqt;
    public NU.TaskDescription<? super java.io.InputStream> copydefault;
    public final C5378Pk djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public java.lang.Class<java.io.InputStream> KWHzl() {
        return java.io.InputStream.class;
    }

    public ND(Call.Factory factory, C5378Pk c5378Pk) {
        this.EZpvd = factory;
        this.djBIcL = c5378Pk;
    }

    @Override // o.NU
    public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super java.io.InputStream> taskDescription) {
        Request.Builder builderUrl = new Request.Builder().url(this.djBIcL.AhwBna());
        for (Map.Entry<java.lang.String, java.lang.String> entry : this.djBIcL.copydefault().entrySet()) {
            builderUrl.addHeader(entry.getKey(), entry.getValue());
        }
        Request requestBuild = builderUrl.build();
        this.copydefault = taskDescription;
        this.OLrzqt = this.EZpvd.newCall(requestBuild);
        this.OLrzqt.enqueue(this);
    }

    @Override // okhttp3.Callback
    public void onFailure(@androidx.annotation.NonNull Call call, @androidx.annotation.NonNull java.io.IOException iOException) {
        this.copydefault.copydefault(iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(@androidx.annotation.NonNull Call call, @androidx.annotation.NonNull Response response) {
        this.AEQbTJ = response.body();
        if (response.isSuccessful()) {
            java.io.InputStream inputStreamOLrzqt = SA.OLrzqt(this.AEQbTJ.byteStream(), ((ResponseBody) SE.OLrzqt(this.AEQbTJ)).contentLength());
            this.KWHzl = inputStreamOLrzqt;
            this.copydefault.KWHzl(inputStreamOLrzqt);
            return;
        }
        this.copydefault.copydefault(new HttpException(response.message(), response.code()));
    }

    @Override // o.NU
    public void AEQbTJ() {
        try {
            java.io.InputStream inputStream = this.KWHzl;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (java.io.IOException unused) {
        }
        ResponseBody responseBody = this.AEQbTJ;
        if (responseBody != null) {
            responseBody.close();
        }
        this.copydefault = null;
    }

    @Override // o.NU
    public void copydefault() {
        Call call = this.OLrzqt;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // o.NU
    public com.bumptech.glide.load.DataSource OLrzqt() {
        return com.bumptech.glide.load.DataSource.REMOTE;
    }
}
