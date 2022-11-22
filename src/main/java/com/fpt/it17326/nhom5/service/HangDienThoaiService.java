package com.fpt.it17326.nhom5.service;

import com.fpt.it17326.nhom5.domainmodel.HangDienThoai;
import com.fpt.it17326.nhom5.response.HangDienThoaiResponse;
import java.util.List;

/**
 * AowVN_Nyaruko
 *
 */
public interface HangDienThoaiService {

    List<HangDienThoaiResponse> getAll();

    HangDienThoaiResponse getOne(String MaAnh);

    String add(HangDienThoai hdt);

    String update(HangDienThoai hdt);

    String delete(HangDienThoai hdt);
}
