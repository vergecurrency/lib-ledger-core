// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from extended_record.djinni

package com.dropbox.djinni.test;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public abstract class InterfaceUsingExtendedRecord {
    @Nonnull
    public static final RecordUsingExtendedRecord CR = new RecordUsingExtendedRecord(
        new ExtendedRecord(
            false /* mFoo */ ) /* mEr */ );

    @Nonnull
    public abstract ExtendedRecord meth(@Nonnull ExtendedRecord er);

    private static final class CppProxy extends InterfaceUsingExtendedRecord
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public ExtendedRecord meth(ExtendedRecord er)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_meth(this.nativeRef, er);
        }
        private native ExtendedRecord native_meth(long _nativeRef, ExtendedRecord er);
    }
}