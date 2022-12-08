package com.dw.drone.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.drone.vo.DroneVO;

@Mapper
public interface DroneMapper {
	
	//등록한 드론 전체 조회
	List<DroneVO> selectAllDrone();
	
	//특정 드론 정보 조회
	DroneVO selectOneDrone(int uuid);
}