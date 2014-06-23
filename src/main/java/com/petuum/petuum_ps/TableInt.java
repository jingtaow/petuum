/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.petuum.petuum_ps;

public class TableInt {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TableInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TableInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        petuumJNI.delete_TableInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TableInt() {
    this(petuumJNI.new_TableInt__SWIG_0(), true);
  }

  public TableInt(TableInt table) {
    this(petuumJNI.new_TableInt__SWIG_1(TableInt.getCPtr(table), table), true);
  }

  public TableInt assign(TableInt table) {
    return new TableInt(petuumJNI.TableInt_assign(swigCPtr, this, TableInt.getCPtr(table), table), false);
  }

  public void GetAsync(int row_id) {
    petuumJNI.TableInt_GetAsync(swigCPtr, this, row_id);
  }

  public void WaitPendingAsyncGet() {
    petuumJNI.TableInt_WaitPendingAsyncGet(swigCPtr, this);
  }

  public void ThreadGet(int row_id, ThreadRowAccessor row_accessor) {
    petuumJNI.TableInt_ThreadGet(swigCPtr, this, row_id, ThreadRowAccessor.getCPtr(row_accessor), row_accessor);
  }

  public void ThreadInc(int row_id, int column_id, int update) {
    petuumJNI.TableInt_ThreadInc(swigCPtr, this, row_id, column_id, update);
  }

  public void ThreadBatchInc(int row_id, UpdateBatchInt update_batch) {
    petuumJNI.TableInt_ThreadBatchInc(swigCPtr, this, row_id, UpdateBatchInt.getCPtr(update_batch), update_batch);
  }

  public void Get(int row_id, RowAccessor row_accessor) {
    petuumJNI.TableInt_Get(swigCPtr, this, row_id, RowAccessor.getCPtr(row_accessor), row_accessor);
  }

  public void Inc(int row_id, int column_id, int update) {
    petuumJNI.TableInt_Inc(swigCPtr, this, row_id, column_id, update);
  }

  public void BatchInc(int row_id, UpdateBatchInt update_batch) {
    petuumJNI.TableInt_BatchInc(swigCPtr, this, row_id, UpdateBatchInt.getCPtr(update_batch), update_batch);
  }

  public int get_row_type() {
    return petuumJNI.TableInt_get_row_type(swigCPtr, this);
  }

}