package o;

import com.getkeepsafe.relinker.MissingLibraryException;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import o.YG;

/* JADX INFO: loaded from: classes2.dex */
public class YF {
    public boolean AEQbTJ;
    public final YG.Activity EZpvd;
    public YG.ActionBar KWHzl;
    public final java.util.Set<java.lang.String> OLrzqt;
    public final YG.StateListAnimator copydefault;
    public boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public YF EZpvd(YG.ActionBar actionBar) {
        this.KWHzl = actionBar;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public YF KWHzl() {
        this.djBIcL = true;
        return this;
    }

    public YF() {
        this(new YJ(), new YI());
    }

    public YF(YG.StateListAnimator stateListAnimator, YG.Activity activity) {
        this.OLrzqt = new java.util.HashSet();
        if (stateListAnimator == null) {
            throw new java.lang.IllegalArgumentException("Cannot pass null library loader");
        }
        if (activity == null) {
            throw new java.lang.IllegalArgumentException("Cannot pass null library installer");
        }
        this.copydefault = stateListAnimator;
        this.EZpvd = activity;
    }

    public void EZpvd(android.content.Context context, java.lang.String str) {
        EZpvd(context, str, null, null);
    }

    public void copydefault(android.content.Context context, java.lang.String str, YG.Application application) {
        EZpvd(context, str, null, application);
    }

    public void EZpvd(final android.content.Context context, final java.lang.String str, final java.lang.String str2, final YG.Application application) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Given context is null");
        }
        if (YN.OLrzqt(str)) {
            throw new java.lang.IllegalArgumentException("Given library is either null or empty");
        }
        copydefault("Beginning load of %s...", str);
        if (application == null) {
            AEQbTJ(context, str, str2);
        } else {
            new java.lang.Thread(new java.lang.Runnable() { // from class: o.YF.3
                @Override // java.lang.Runnable
                public void run() throws java.lang.Throwable {
                    try {
                        YF.this.AEQbTJ(context, str, str2);
                        application.success();
                    } catch (MissingLibraryException e) {
                        application.failure(e);
                    } catch (java.lang.UnsatisfiedLinkError e2) {
                        application.failure(e2);
                    }
                }
            }).start();
        }
    }

    public final void AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        YP yp;
        if (this.OLrzqt.contains(str) && !this.AEQbTJ) {
            copydefault("%s already loaded previously!", str);
            return;
        }
        try {
            this.copydefault.AEQbTJ(str);
            this.OLrzqt.add(str);
            copydefault("%s (%s) was loaded normally!", str, str2);
        } catch (java.lang.UnsatisfiedLinkError e) {
            copydefault("Loading the library normally failed: %s", android.util.Log.getStackTraceString(e));
            copydefault("%s (%s) was not loaded normally, re-linking...", str, str2);
            java.io.File fileCopydefault = copydefault(context, str, str2);
            if (!fileCopydefault.exists() || this.AEQbTJ) {
                if (this.AEQbTJ) {
                    copydefault("Forcing a re-link of %s (%s)...", str, str2);
                }
                KWHzl(context, str, str2);
                this.EZpvd.EZpvd(context, this.copydefault.KWHzl(), this.copydefault.EZpvd(str), fileCopydefault, this);
            }
            try {
                if (this.djBIcL) {
                    try {
                        yp = new YP(fileCopydefault);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        yp = null;
                    }
                    try {
                        java.util.List<java.lang.String> listCopydefault = yp.copydefault();
                        yp.close();
                        java.util.Iterator<java.lang.String> it = listCopydefault.iterator();
                        while (it.hasNext()) {
                            EZpvd(context, this.copydefault.copydefault(it.next()));
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (yp != null) {
                            yp.close();
                        }
                        throw th;
                    }
                }
            } catch (java.io.IOException unused) {
            }
            this.copydefault.OLrzqt(fileCopydefault.getAbsolutePath());
            this.OLrzqt.add(str);
            copydefault("%s (%s) was re-linked!", str, str2);
        }
    }

    public java.io.File AEQbTJ(android.content.Context context) {
        return context.getDir("lib", 0);
    }

    public java.io.File copydefault(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String strEZpvd = this.copydefault.EZpvd(str);
        if (YN.OLrzqt(str2)) {
            return new java.io.File(AEQbTJ(context), strEZpvd);
        }
        return new java.io.File(AEQbTJ(context), strEZpvd + JwtUtilsKt.JWT_DELIMITER + str2);
    }

    public void KWHzl(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File fileAEQbTJ = AEQbTJ(context);
        java.io.File fileCopydefault = copydefault(context, str, str2);
        final java.lang.String strEZpvd = this.copydefault.EZpvd(str);
        java.io.File[] fileArrListFiles = fileAEQbTJ.listFiles(new java.io.FilenameFilter() { // from class: o.YF.5
            @Override // java.io.FilenameFilter
            public boolean accept(java.io.File file, java.lang.String str3) {
                return str3.startsWith(strEZpvd);
            }
        });
        if (fileArrListFiles == null) {
            return;
        }
        for (java.io.File file : fileArrListFiles) {
            if (this.AEQbTJ || !file.getAbsolutePath().equals(fileCopydefault.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public void copydefault(java.lang.String str, java.lang.Object... objArr) {
        AEQbTJ(java.lang.String.format(java.util.Locale.US, str, objArr));
    }

    public void AEQbTJ(java.lang.String str) {
        YG.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.log(str);
        }
    }
}
